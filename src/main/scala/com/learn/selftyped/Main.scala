package com.learn.selftyped

@main
def main(): Unit = {
  val admin = new Admin("admin1")
  admin.log("This is a log message.") // Output: admin1: This is a log message.
}
