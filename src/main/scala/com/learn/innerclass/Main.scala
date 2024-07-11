package com.learn.innerclass

@main
def main(): Unit = {
  val outer1 = new Outer
  val outer2 = new Outer

  val inner1 = outer1.createInnerInstance()
  val inner2 = outer2.createInnerInstance()

  inner1.greet() // Output: Hello from the inner class!
  inner2.greet() // Output: Hello from the inner class!
}