package com.learn.polymorphic

abstract class Animal {
  def sound(): String
}

class Dog extends Animal {
  def sound(): String = "Woof!"
}

class Cat extends Animal {
  def sound(): String = "Meow!"
}

// Polymorphic method
def makeSound(animal: Animal): Unit = {
  println(animal.sound())
}


