package core

import scala.util.Random

object Main7 {
  def main(args: Array[String]): Unit = {

    val x: Int = Random.nextInt(10)

    def matchTest(x: Int) = x match
      case 0 => "zero"
      case 1 => "one"
      case _ => "other"


    println(matchTest(3))




    sealed trait Notification

    case class Email(sender: String, title: String, body: String) extends Notification
    case class SMS(caller: String, message: String) extends Notification
    case class VoiceRecording(contactName: String, link: String) extends Notification

    def showNotification(notification: Notification): String =
      notification match
        case Email(sender, title, _) =>
          s"You got an email from $sender with title: $title"
        case SMS(number, message) =>
          s"You got an SMS from $number! Message: $message"
        case VoiceRecording(name, link) if name == "Tom" =>
          s"You received a Voice Recording from $name! Click the link to hear it: $link"
        case other => s"Restricted"

    val someSms = SMS("12345", "Hi")
    val someVR = VoiceRecording("Tom", "voicerecording.org/id/123")
    val someVR2 = VoiceRecording("Not Tom", "voicerecording.org/id/123")

    println(showNotification(someSms))
    println(showNotification(someVR))
    println(showNotification(someVR2))



    sealed trait Device

    case class Phone(model: String) extends Device:
      def screenOff = "Turning screen off"

    case class Computer(model: String) extends Device:
      def screenSaverOn = "Turning screen saver on..."


    def goIdle(device: Device) = device match
      case p: Phone => p.screenOff
      case c: Computer => c.screenSaverOn

    println(goIdle(Phone("Iphone")))
    println(goIdle(Computer("Lenovo")))

  }
}
