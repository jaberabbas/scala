package com.learn.polymorphic

class Parametric {
  def listOfDuplicates[A](x: A, length: Int): List[A] = {
    if length < 1 then
      Nil
    else
      x :: listOfDuplicates(x, length - 1)
  }

  def printElement[A](element: A): Unit = {
    println(s"Element: $element")
  }

}
