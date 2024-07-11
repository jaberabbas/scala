package com.learn.patternmatch

@main
def main(): Unit = {

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

}