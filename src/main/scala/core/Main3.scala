package core

object Main3 {
  def main(args: Array[String]): Unit = {

    trait Iterator[A]:
      def hashNext: Boolean
      def next(): A


    class IntIterator(to: Int) extends Iterator[Int]:
      private var current = 0

      override def hashNext: Boolean = current < to
      override def next(): Int =
        if hashNext then
          val t = current
          current += 1
          t
        else
          0

    val iterator = IntIterator(10)
    iterator.next()
    iterator.next()
    println(iterator.hashNext)


    val planets =
      List(("Mercury", 57.9), ("Earth", 149.6))

    planets.foreach {
      case ("Earth", distance) =>
        println(s"Our planet is $distance million km from the sun")
      case _ =>
    }

    case class Planet(name: String, distance: Double)

    val case_planets =
      List(Planet("Mercury", 57.9), Planet("Earth", 149.6))

    case_planets.foreach {
      case Planet("Earth", distance) =>
        println(s"Our planet is $distance million km from the sun")
      case _ =>
    }


  }
}
