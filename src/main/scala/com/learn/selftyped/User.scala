package com.learn.selftyped

trait User {
  def username: String
}

trait Logger {
  self: User => // This is the self-type annotation

  def log(message: String): Unit = {
    println(s"$username: $message")
  }
}

class Admin(val username: String) extends User with Logger



