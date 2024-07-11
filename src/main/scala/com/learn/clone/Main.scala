package com.learn.clone

@main
def main(): Unit = {
  val originalAddress = new Address("123 Main St", "Springfield")
  val original = new Person("Alice", 30, originalAddress)
  val clone = original.clone()

  println(original.address.street) // Output: 123 Main St
  println(clone.address.street) // Output: 123 Main St
}
