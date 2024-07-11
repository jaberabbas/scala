package com.learn.generic

class Stack[A] {
  private var elements: List[A] = Nil //Nill means empty

  def push(x: A): Unit =
    elements = x :: elements

  def peek: A = elements.head

  def pop(): A =
    val currentTop = peek
    elements = elements.tail
    currentTop
}
class Fruit
class Apple extends Fruit:
  override def toString: String = "apple"
class Banana extends Fruit:
  override def toString: String = "banana"
