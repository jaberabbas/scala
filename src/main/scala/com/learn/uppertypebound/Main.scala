package com.learn.uppertypebound

@main
def main(): Unit ={
  val cowContainer = PetContainer[Cow](Cow())
  val elephantContainer = PetContainer[Elephant](Elephant())
  //val lionContainer = PetContainer[Lion](Lion()) //compiler error
}