package com.eu.auth

import com.eu.base64.Base64Decoder

import java.time.{Instant, LocalDateTime, ZoneId}

class CustomHeaderAuthenticator extends HeaderAuthenticator{
  override def extractUsername(request: ServerHttpRequest): Option[String] = {
    val token = request.getToken //replace with the ServerHttpRequest method to get the token
    val exp = Base64Decoder.getValue(token, "exp")
    isTokenExpired(exp.toLong)
    val sub = Base64Decoder.getValue(token, "sub")
    Option(sub)
  }

  private def isTokenExpired(exp : Long): Boolean = {
    //convert Long to datetime
    val expirationDateTime: LocalDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(exp.toLong), ZoneId.systemDefault())
    println(s"expiration Date Time: $expirationDateTime")
    val currentDateTime: LocalDateTime = LocalDateTime.now()
    println("currentDateTime: " + currentDateTime)
    if (currentDateTime.isAfter(expirationDateTime)) {
      println("Token is already expired on: " + expirationDateTime)
      return true
    } else if (currentDateTime.isBefore(expirationDateTime)) {
      println("token is still valid : " + expirationDateTime)
      return false
    } else {
      println("warning: token will expire today: " + expirationDateTime)
      return false
    }
  }
}

