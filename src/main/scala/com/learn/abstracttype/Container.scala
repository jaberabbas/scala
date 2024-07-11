package com.learn.abstracttype

trait Container {
  type A
  def value: A
}

class StringContainer(val value: String) extends Container {
  type A = String
}

class IntContainer(val value: Int) extends Container {
  type A = Int
}

def printContainer(container: Container): Unit = {
  println(container.value)
}



