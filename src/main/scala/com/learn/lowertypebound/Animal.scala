package com.learn.lowertypebound

trait Animal {
  def name: String
}

class Dog extends Animal {
  def name: String = "Dog"
}

class Cat extends Animal {
  def name: String = "Cat"
}

class Container[A >: Dog](val value: A)