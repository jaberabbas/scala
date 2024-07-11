package com.learn.abstracttype

@main
def main(): Unit = {
  val stringContainer = new StringContainer("Hello")
  val intContainer = new IntContainer(42)

  printContainer(stringContainer) // Output: Hello
  printContainer(intContainer) // Output: 42
}
