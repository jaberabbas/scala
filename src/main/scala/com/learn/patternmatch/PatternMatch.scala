package com.learn.patternmatch

class PatternMatch {
  val x: String = "Hello"
  def matchInt(n: Int): String = {
    n match
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case _ => "not defined"
  }

  def showNotification(notification: Notification): String =
    notification match
      case Email(sender, title, _) =>
        s"You got an email from $sender with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"You received a Voice Recording from $name! Click the link to hear it: $link"

  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String =
    notification match
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case SMS(caller, _) if importantPeopleInfo.contains(caller) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other) // nothing special, delegate to our original showNotification function

  def goIdle(device: Device): String = device match
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn

}
