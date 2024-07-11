package com.learn.innerclass

class Outer {
  class Inner {
    def greet(): Unit = {
      println("Hello from the inner class!")
    }
  }

  def createInnerInstance(): Inner = {
    new Inner
  }
}


