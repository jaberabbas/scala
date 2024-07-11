package com.learn.uppertypebound

abstract class Animal:
  def name: String

abstract class Pet extends Animal

class Cow extends Pet:
  override def name: String = "Cow"

class Elephant extends Pet:
  override def name: String = "Elephant"

class Lion extends Animal:
  override def name: String = "Lion"

class PetContainer[P <: Pet](p: P):
  def pet: P = p
