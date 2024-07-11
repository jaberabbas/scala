package com.learn.generic

@main
def main(): Unit = {
  val stackFruit = Stack[Fruit]
  val apple = Apple()
  val banana = Banana()

  stackFruit.push(apple)
  stackFruit.push(banana)

  println(stackFruit.peek)

  val stack = Stack[Int]
  stack.push(1)
  stack.push(2)
  stack.push(3)
  println(stack.peek) // prints 3
  println(stack.pop()) // prints 3
  println(stack.pop()) // prints 2
  println(stack.pop()) // prints 1
}