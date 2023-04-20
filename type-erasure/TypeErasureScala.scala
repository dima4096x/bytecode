package dima4096x

case class Person(name: String):
  final def boo = println(name)

object TypeErasureScala:
  val p = Person("dima")
  p.boo

  def arrayMatch[T](array: Array[T]): Unit =
    array match
      case a: Array[Int] => println("int")
      case a: Array[Long] => println("long")
      case a: Array[Person] => println("person")
      case a: Array[_] => println("any")

  def listMatchBad[T](list: List[T]): Unit =
    list match
      case l: List[Int] => println("int")
      case l: List[Person] => println("person")
      case l: List[Long] => println("long")
      case l: List[_] => println("any")
