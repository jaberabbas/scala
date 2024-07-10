import com.learn.patternmatch.{Computer, Email, PatternMatch, Phone, SMS, VoiceRecording}
import com.learn.regex.RegEx
import com.learn.{Cat, Greeting, IntIterator, Logger, Mouse, Pet, Point}

import scala.collection.mutable.ArrayBuffer

@main
def main(): Unit =

  RegEx().saveContactInformation("123-456-7890")
  RegEx().saveContactInformation("JohnSmith@sample.domain.com")
  RegEx().saveContactInformation("2 Franklin St, Mars, Milky Way")

  RegEx().passwordCheck("thisispassword123")
  val input: String =
    """background-color: #A03300;
      |background-image: url(img/header100.png);
      |background-position: top center;
      |background-repeat: repeat-x;
      |background-size: 2160px 108px;
      |margin: 0;
      |height: 108px;
      |width: 100%;""".stripMargin
  RegEx().keyValueGroups(input)
  Logger.info("I am here")
  Logger.debug("this is a debug message, so it is looooooooooooooooooooooooooooooong")
  Logger.error("this is error")
  val iphone = Phone("Iphone")
  val laptop = Computer("laptop")
  println(PatternMatch().goIdle(iphone))
  println(PatternMatch().goIdle(laptop))
  val someSms = SMS("12345", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

  println(PatternMatch().showNotification(someSms)) // prints You got an SMS from 12345! Message: Are you there?
  println(PatternMatch().showNotification(someVoiceRecording))

  val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

  val someSms1 = SMS("123-4567", "Are you there?")
  val someVoiceRecording1 = VoiceRecording("Tom", "voicerecording.org/id/123")
  val importantEmail1 = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
  val importantSms1 = SMS("867-5309", "I'm here! Where are you?")

  println(PatternMatch().showImportantNotification(someSms1, importantPeopleInfo)) // prints You got an SMS from 123-4567! Message: Are you there?
  println(PatternMatch().showImportantNotification(someVoiceRecording1, importantPeopleInfo)) // prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
  println(PatternMatch().showImportantNotification(importantEmail1, importantPeopleInfo)) // prints You got an email from special someone!

  println(PatternMatch().showImportantNotification(importantSms1, importantPeopleInfo)) // prints You got an SMS from special someone!

  println(PatternMatch().matchInt(1))
  println(PatternMatch().matchInt(5))
  val animals =  ArrayBuffer[Pet]().empty
  val kate = Cat("Kate")
  val miki = Mouse("Miki")
  animals.append(kate)
  animals.append(miki)
  animals.foreach(pet => println(pet.name))
  val intIterator = IntIterator(3)
  println("hasNext"  + intIterator.hasNext)
  println("next " + intIterator.next)
  println("next " + intIterator.next)
  println("next " + intIterator.next)
  for (i <- 0 until 3) {
    println("next " + intIterator.next)
  }

  val p1: Unit = Point(10, 10)
  println(p1)
  val g = Greeting("Sunday", "2024").great("Scala")
  println(g)
  val mydog = Dog()
  mydog.speak()
  mydog.tailMove()

  println("Hello world!")
  println(test("Scala"))
  println(square(3))
  println(age())
  defaultParam("John")


  def defaultParam(name : String, greeting : String = "Hello ") : Unit={
    println(s"$greeting$name")
  }
  def test(str: String) : String ={
    "Hello " + str
  }

  def square (x :Int): Int ={
    x * x
  }

  def age(): String =
    val age = Seq(20, 30, 40)
    s"the max age is ${age.max}"





