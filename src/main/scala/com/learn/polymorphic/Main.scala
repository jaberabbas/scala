package com.learn.polymorphic

@main
def main(): Unit = {

  //Parametric
  println(Parametric().listOfDuplicates[Int](3, 4)) // List(3, 3, 3, 3)
  println(Parametric().listOfDuplicates("La", 8)) // List(La, La, La, La, La, La, La, La)

  // Using the generic function with different types
  Parametric().printElement(42) // Outputs: Element: 42
  Parametric().printElement("Hello") // Outputs: Element: Hello
  Parametric().printElement(true) // Outputs: Element: true

  //Inheritance
  val dog = new Dog()
  val cat = new Cat()

  makeSound(dog) // Outputs: Woof!
  makeSound(cat) // Outputs: Meow!
}