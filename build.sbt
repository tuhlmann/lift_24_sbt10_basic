organization := "com.agynamix"

name := "LiftBasic"

version := "0.1"

scalaVersion := "2.9.1"

// scalacOptions += "-deprecation"

seq(webSettings :_*)

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "Lift Snapshots" at "http://scala-tools.org/repo-snapshots/"

libraryDependencies ++= {
    val liftVersion = "2.4-M4"
    Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-wizard" % liftVersion % "compile->default")
  }

// "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty,test", // For Jetty 6, add scope test to make jetty avl. for tests

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "7.3.0.v20110203" % "jetty,test", // For Jetty 7
  "junit" % "junit" % "4.5" % "test->default",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "com.h2database" % "h2" % "1.2.138",
  "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default"
)

// jettyClasspaths <<= (jettyClasspaths, sourceDirectory).map((j, src) => j.copy(classpath = j.classpath +++ src / "development" / "resources"))

// If using JRebel uncomment next line
jettyScanDirs := Nil

temporaryWarPath <<= (sourceDirectory in Compile)(_ / "webapp")
