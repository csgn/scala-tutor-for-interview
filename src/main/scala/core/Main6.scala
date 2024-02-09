package core

object Main6 {
  def main(args: Array[String]): Unit = {

    case class Book(isbn: String)

    class CBook(isbn: String, var public_isbn: String)

    val frankenstein = Book("978-03123123")
    // frankenstein.isbn   OK
    // frankenstein.isbn = "hello world"   ERROR

    val frankenstein2 = CBook(("984-2141241"), "978-4124124")
    // frankenstein2.isbn  ERROR
    // frankenstein2.public_isbn = "hello world"   OK


    case class Message(sender: String, recipient: String, body: String)
    val msg4 = Message("ex@gmail.com", "tr@gmail.com", "hello")
    val msg5 = msg4.copy(sender=msg4.recipient, recipient = msg4.sender, "hi")

    println(msg5.sender)


  }
}
