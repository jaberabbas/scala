package com.learn.lowertypebound


  @main
  def main(): Unit = {
    val dogContainer: Container[Dog] =  Container(new Dog)
    val animalContainer: Container[Animal] = new Container(new Dog)
    val anyContainer: Container[Any] = new Container(new Dog)

    println(dogContainer.value.name) // Output: Dog
    println(animalContainer.value.name) // Output: Dog
    println(anyContainer.value) // Output: Dog@<hashcode>

  }

