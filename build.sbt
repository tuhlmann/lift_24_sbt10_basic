name := "LiftBasic"

scalaVersion := "2.9.0-1"

seq(webSettings :_*)

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

libraryDependencies ++= {
    val liftVersion = "2.4-M3"
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

// If using JRebel uncomment next line
jettyScanDirs := Nil

temporaryWarPath <<= (sourceDirectory in Compile)(_ / "webapp")
