organization := "com.nkouevda"
name := "future-examples"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.8"

val comTwitterUtilVersion = "20.12.0"

libraryDependencies ++= Seq(
  "com.twitter" %% "util-app" % comTwitterUtilVersion,
  "com.twitter" %% "util-core" % comTwitterUtilVersion,
)
