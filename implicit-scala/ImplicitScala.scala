package dima4096x

import ImplicitScala._

class ImplicitScala:
  def good =
    val p = Person("dima4096x")
    p.greetingAnyVal

  def bad =
    val p = Person("dima4096x")
    p.greeting


object ImplicitScala:
  implicit class RichPersonGood(p: Person) extends AnyVal:
    def greetingAnyVal = s"Hello, ${p.name}"

  implicit class RichPersonBad(p: Person):
    def greeting = s"Hello, ${p.name}"


case class Person(name: String):
  def capitalize() = s"$name".toUpperCase
