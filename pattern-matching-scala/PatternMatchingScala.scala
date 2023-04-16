package dima4096x

object PatternMatchingScala:
  val p: Money = RUB(20L)
  p match
    case USD(amount) => println(s"USD $amount")
    case RUB(_) => println("RUB")
    case gbr: GBR => println(s"GBR ${gbr.amount}")

sealed trait Money

case class USD(amount: Long) extends Money

case class RUB(amount: Long) extends Money

class GBR(val amount: Long) extends Money
