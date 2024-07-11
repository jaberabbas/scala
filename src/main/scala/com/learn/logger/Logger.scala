package com.learn.logger

object Logger {
  def info(msg: String): Unit = println(s"INFO:  $msg")
  def debug(msg: String): Unit = println(s"DEBUG: $msg")
  def error(msg: String): Unit = println(s"ERROR: $msg")

}
