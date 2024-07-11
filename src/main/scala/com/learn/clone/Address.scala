package com.learn.clone

class Address(val street: String, val city: String) {
  override def clone(): Address = new Address(this.street, this.city)
}

class Person(val name: String, val age: Int, val address: Address) {
  override def clone(): Person = new Person(this.name, this.age, this.address.clone())
}


