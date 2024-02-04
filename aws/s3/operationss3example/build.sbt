val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "operationsS3Example",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= {
      Seq(
        "io.laserdisc" %% "fs2-aws-s3" % "6.1.1",
        "io.laserdisc" %% "fs2-aws-core" % "6.1.1",
        "io.laserdisc" %% "pure-s3-tagless" % "6.1.1",
        "software.amazon.awssdk" % "aws-sdk-java" % "2.17.87",
        "co.fs2" %% "fs2-core" % "3.9.4",
        "org.slf4j" % "slf4j-simple" % "2.0.11" ,
        "org.scalameta" %% "munit" % "0.7.29" % Test

      )
    } 
 )
