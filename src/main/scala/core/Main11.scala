package core

object Main11 {
  def main(args: Array[String]): Unit = {

    class Stack[A]:
      private var elements: List[A] = Nil

      def push(x: A): Unit =
        elements = x :: elements

      def peek: A = elements.head

      def pop(): A =
        val currentTop = peek
        elements = elements.tail
        currentTop

  }
}
