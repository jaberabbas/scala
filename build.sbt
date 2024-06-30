ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2"

lazy val root = (project in file("."))
  .settings(
    name := "Base64Encoding",
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.10.5",
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    )

  )
