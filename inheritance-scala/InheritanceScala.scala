package dima4096x

object InheritanceScala:
  def boo =
    val parrotThreeLanguage = new ParrotThreeLanguage()
    parrotThreeLanguage.speak

trait Parrot:
  def speak: Unit

class ParrotOneLanguage extends Parrot:
  override def speak = println("hello")


class ParrotTwoLanguage extends ParrotOneLanguage:
  override def speak =
    super.speak
    println("bonjour")


class ParrotThreeLanguage extends ParrotTwoLanguage:
  override def speak =
    super.speak
    println("hej")
