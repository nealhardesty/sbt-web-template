name := "SBTJettyTemplate"

version := "1.0"

scalaVersion := "2.10.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalatra" %% "scalatra" % "2.2.1"

libraryDependencies += "org.eclipse.jetty" % "jetty-server" % "8.1.12.v20130726"

libraryDependencies += "org.eclipse.jetty" % "jetty-servlet" % "8.1.12.v20130726"

libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "8.1.12.v20130726"
