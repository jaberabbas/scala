package com.eu.auth

//replace this class by the real one from Quantexa using dependencies
//add the dependency into the file build.sbt
class ServerHttpRequest {
  private var token = "eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE3MTk0ODk4MDYsInN1YiI6InN1cGVyLWFkbWluIiwiZXhwIjoxNzE5NDkxNjA2LCJ0b2tlblR5cGUiOiJkZWZhdWx0VjIifQ.KJc1175pjeRFcSokDC6QZiCYP_qPK-AgFIm3hIfFZvM"
  def getToken: String = token
}