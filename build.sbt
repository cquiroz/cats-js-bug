// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "cats-js-demo"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "0.9.1-SNAPSHOT"
)

