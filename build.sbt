ThisBuild / scalaVersion := "3.3.1"
ThisBuild / organization := "the.cool.org"

lazy val app = project
  .in(file("."))
  .settings(
    name := "yet another app",
    libraryDependencies += "org.scala-lang" %% "toolkit" % "0.1.7",
    libraryDependencies += "org.apache.commons" % "commons-text" % "1.9",
  )
