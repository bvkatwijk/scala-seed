package $package$

object Main {
  def main(args: Array[String]): Unit = println(message(args))

  def message(args: Array[String]): String = s"main called with args \${args.mkString("[", ", ", "]")}"
}