package com.eu.auth

//replace this class by the real one from Quantexa using dependencies
//add the dependency into the file build.sbt
trait HeaderAuthenticator {
   def extractUsername(request: ServerHttpRequest): Option[String]
  }
