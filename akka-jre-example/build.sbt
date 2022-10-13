import Dependencies._

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

val akkaVersion = "2.6.19"
val akkaHttpVersion = "10.2.9"

// mainClassPath is the Class that has a main method (or)
// the Object Class that exteds App
val mainClassPath = "example.MyClass"

lazy val root = (project in file("."))
  .settings(
    name := "akka-jre-example",
    assembly / assemblyJarName := "sample-akka-api-v3.jar",
    assembly / mainClass := Some(mainClassPath),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream" % akkaVersion,
      "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion
    ),
    libraryDependencies += scalaTest % Test
  )
