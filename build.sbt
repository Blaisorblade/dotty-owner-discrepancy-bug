//val dottyVersion = "0.20.0-RC1"
//scalaVersion := "0.20.0-RC1"
//scalaVersion := dottyLatestNightlyBuild.get
val dottyVersion = "0.21.0-bin-20191209-0e761ea-NIGHTLY"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-simple",
    version := "0.1.0",

    scalaVersion := dottyVersion,
  )
