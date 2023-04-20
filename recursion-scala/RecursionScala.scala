package dima4096x

import scala.annotation.tailrec

class RecursionScala():
  final def factorialBad(i: Int): Int =
    if (i == 0 || i == 1) 1
    else i * factorialBad(i - 1)

  @tailrec
  final def factorialGood(i: Int, acc: Int = 1): Int =
    if (i < 1) acc
    else factorialGood(i - 1, acc * i)
