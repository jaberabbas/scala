package com.learn.extractorobject

@main
def main(): Unit = {
  val customer1ID = CustomerID("Sukyoung")
  println(customer1ID)
  customer1ID match
    case CustomerID(name) => println(name) // prints Sukyoung
    case _ => println("Could not extract a CustomerID")
}