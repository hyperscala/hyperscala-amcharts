name := "hyperscala-amcharts"

organization := "org.hyperscala"

version := "0.10.0-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "0.10.0-SNAPSHOT"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.4-SNAPSHOT"

libraryDependencies += "org.scalatest" %% "scalatest" % "latest.release" % "test"

testOptions in Test += Tests.Argument("-oDF")

seq(Revolver.settings: _*)
