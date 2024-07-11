package com.learn.intersectiontypes

trait Flyer {
  def fly(): Unit
}

trait Swimmer {
  def swim(): Unit
}

class Duck extends Flyer with Swimmer {
  def fly(): Unit = println("Duck is flying")
  def swim(): Unit = println("Duck is swimming")
}

def performActions(animal: Flyer & Swimmer): Unit = {
  animal.fly()
  animal.swim()
}