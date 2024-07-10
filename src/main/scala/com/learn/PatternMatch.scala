package com.learn

class PatternMatch {
  val x: String = "Hello"
  def matchInt(n: Int): String = {
    n match
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case _ => "not defined"
  }
}
