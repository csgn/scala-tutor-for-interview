package core

object Main2 {
  def main(args: Array[String]): Unit = {

    class User

    val user1 = User()


    class Point(var x: Int, var y: Int):
      def move(dx: Int, dy: Int): Unit =
        x = x + dx
        y = y + dy

      override def toString: String =
        s"($x, $y)"


    val point_1 = Point(2, 3)
    println(point_1.x)

    class Point2(var x: Int = 0, var y: Int = 0)

    val point_2 = Point2()
    println(point_2.x)


    class PointPrivate:
      private var _x = 0
      private var _y = 0

      def x: Int = _x
      def x_=(newValue: Int): Unit =
        _x = newValue

      def y: Int = _y
      def y_=(newValue: Int): Unit =
        _y = newValue



    val pprivate = PointPrivate()
    pprivate.x = 1
    pprivate.y = 1
    println(pprivate.x + " " + pprivate.y)

  }
}
