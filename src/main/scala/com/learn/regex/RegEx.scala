package com.learn.regex

import scala.util.matching.Regex

class RegEx {
  private val numberPattern: Regex = "[0-9]".r

  def passwordCheck(pass: String): Unit = {
  numberPattern.findFirstMatchIn(pass) match
    case Some(_) => println("Password OK")
    case None => println("Password must contain a number")
  }
  def keyValueGroups(keValue: String): Unit= {
    val keyValPattern: Regex = "([0-9a-zA-Z- ]+): ([0-9a-zA-Z-#()/. ]+)".r
    for patternMatch <- keyValPattern.findAllMatchIn(keValue) do
      println(s"key: ${patternMatch.group(1)} value: ${patternMatch.group(2)}")
  }

  def saveContactInformation(contact: String): Unit =

    val emailPattern: Regex = """^(\w+)@(\w+(.\w+)+)$""".r
    val phonePattern: Regex = """^(\d{3}-\d{3}-\d{4})$""".r

    contact match
      case emailPattern(localPart, domainName, _) =>
        println(s"Hi $localPart, $domainName we have saved your email address.")
      case phonePattern(phoneNumber) =>
        println(s"Hi, we have saved your phone number $phoneNumber.")
      case _ =>
        println("Invalid contact information, neither an email address nor phone number.")
}

