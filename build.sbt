organization := "com.nkouevda"
name := "future-examples"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.11"

val comTwitterUtilVersion = "18.3.0"

libraryDependencies ++= Seq(
  "com.twitter" %% "util-app" % comTwitterUtilVersion,
  "com.twitter" %% "util-core" % comTwitterUtilVersion
)
