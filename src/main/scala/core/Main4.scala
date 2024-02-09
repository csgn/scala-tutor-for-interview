package core

object Main4 {
  def main(args: Array[String]): Unit = {

    abstract class A:
      val message: String;

    class B extends A:
      override val message: String = "I'm an instance of class B"

    trait C extends A:
      def loudMessage = message.toUpperCase()

    class D extends B, C

    val d = D()
    println(d.message)
    println(d.loudMessage)


    abstract class AbsIterator:
      type T
      def hashNext: Boolean
      def next(): T

    class StringIterator(s: String) extends AbsIterator:
      type T = Char
      private var i = 0

      override def hashNext: Boolean = i < s.length

      override def next(): Char =
        val ch = s charAt i
        i += 1
        ch

    trait RichIterator extends AbsIterator:
      def foreach(f: T => Unit): Unit = while hashNext do f(next())


    class RichStringIterator extends StringIterator("Scala"), RichIterator

    val richStringIterator = RichStringIterator()
    // S, c, a, l, a
    richStringIterator.foreach(println)
  }
}
