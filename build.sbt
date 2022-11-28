import Dependencies._

ThisBuild / scalaVersion     := "3.1.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "langgen",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
// https://mvnrepository.com/artifact/com.github.julien-truffaut/monocle-core
libraryDependencies += "com.github.julien-truffaut" %% "monocle-core" % "3.0.0-M6"
// https://mvnrepository.com/artifact/org.typelevel/cats-collections-core
libraryDependencies += "org.typelevel" %% "cats-collections-core" % "0.9.4"
// https://mvnrepository.com/artifact/com.carrotsearch/java-sizeof
libraryDependencies += "com.carrotsearch" % "java-sizeof" % "0.0.5"
