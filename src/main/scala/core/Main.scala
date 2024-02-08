package core

object Main {
  def main(args: Array[String]): Unit = {
    // 1 + 1 is a expression and expressions are computable statements.
    // val means is, we can store the results of the expressions using the val kwds.
    // the x are called values.
    val x = 1 + 1

    // and we can show the results of expressions using println
    println(x)

    // we can't re-assign the value and scala's compiler does not allowed to do this.
    // x = 3

    val y: Int = 2 + 2

    var z = 1 + 1
    z = 2 + 2

    var i: Int = 0

    // blocks
    // we can combine some expressions by surrounding them with curly brackets
    println({
      val x = 1 + 1
      x + 1
    })

    val addOne = (x: Int) => x + 1
    println(addOne(2))


    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(1, 1)(3))


    class Greeter(prefix: String, suffix: String):
      def greet(name: String): Unit = println(prefix + name + suffix)


    val greeter = Greeter("Hello, ", "!")
    greeter.greet("Sergen")


    class Point(x: Int, y: Int)
    val point_1 = Point(1, 2)
    val point_2 = Point(1, 2)
    val point_3 = Point(2, 3)
    println(point_1 == point_2)

    case class CPoint(x: Int, y: Int)
    val cpoint_1 = CPoint(1, 2)
    val cpoint_2 = CPoint(1, 2)
    val cpoint_3 = CPoint(2, 2)
    println(cpoint_1 == cpoint_2)


    // like singleton pattern
    object IdFactory:
      private var counter = 0
      def create(): Int = {
        counter += 1
        counter
      }

    val newId: Int = IdFactory.create()
    val newerID: Int = IdFactory.create()


    // like interfaces
    trait TGreeter:
      def greet(name: String): Unit

    class CustomizableGreeter(prefix: String, postfix: String) extends TGreeter:
      override def greet(name: String): Unit = println(prefix + name + postfix)

    val tgreeter = CustomizableGreeter("Hello, ", "!")
    println(tgreeter.greet("Sergen"))


    val list: List[Any] = List(1, 2, false, "String", 'c', () => "an lambda function")
    list.foreach(el => println(el))
  }
}
