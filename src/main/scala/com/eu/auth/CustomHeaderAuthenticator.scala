package com.eu.auth

import com.eu.base64.Base64Decoder

class CustomHeaderAuthenticator extends HeaderAuthenticator{
  override def extractUsername(request: ServerHttpRequest): Option[String] = {
    val token = request.getToken
    val sub = Base64Decoder.getValue(token, "sub")
    Option(sub)
  }
}

