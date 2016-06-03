name := "uikka"

version := "1.0"

scalaVersion := "2.11.8"

val akkaVersion = "2.4.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion,
  // UI
  "jgoodies" % "looks" % "1.2.2",
  "jgoodies" % "forms" % "1.0.5"
)