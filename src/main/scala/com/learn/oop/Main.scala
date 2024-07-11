package com.learn.oop

import com.learn.lowertypebound.Dog

import scala.collection.mutable.ArrayBuffer

@main
def main(): Unit = {
  val animals = ArrayBuffer[Pet]().empty
  val kate = Cat("Kate")
  val miki = Mouse("Miki")
  animals.append(kate)
  animals.append(miki)
  animals.foreach(pet => println(pet.name))
}
