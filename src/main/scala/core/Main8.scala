package core

object Main8 {
  def main(args: Array[String]): Unit = {

    object Logger:
      def info(message: String): Unit = println(s"INFO $message")


    // companion
    case class Circle(radius: Double):
      import Circle.*
      def area: Double = calculateArea(radius)

    object Circle:
      private def calculateArea(radius: Double): Double = math.Pi * math.pow(radius, 2.0)

    val circle1 = Circle(5.0)
    println(circle1.area)



    class Email(val username: String, val domainName: String)

    object Email:
      def fromString(emailString: String): Option[Email] =
        emailString.split('@') match
          case Array(a, b) => Some(Email(a, b))
          case _ => None


    // dev.csgn, gmail.com
    val email1 = Email.fromString("dev.csgn@gmail.com")
    email1 match
      case Some(email) => println(s"""Username ${email.username}\nDomain Name ${email.domainName}""")
      case None => println("Error: could not parse the email")

  }
}
