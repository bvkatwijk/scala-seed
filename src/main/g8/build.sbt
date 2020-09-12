ThisBuild / organization := "$apex$.$username$"
ThisBuild / scalaVersion := "$scala_version$"

lazy val root = project
  .in(file("."))
  .settings(
    version := "0.1.0",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.2" % "test"
    )
  )
