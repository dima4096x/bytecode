package dima4096x

class CompareScala:
  def compareInt(int1: Int, int2: Int) =
    int1.compare(int2)

  def compareIntJava(int1: Int, int2: Int) =
    java.lang.Integer.compare(int1, int2)
