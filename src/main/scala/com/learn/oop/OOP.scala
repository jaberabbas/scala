trait Animal:
  def speak() : Unit

trait HasTail:
  def tailMove() : Unit

class Dog extends Animal, HasTail:
  def speak(): Unit = 
    println("wouf wouf")

  def tailMove(): Unit = 
    println("left, right")


  