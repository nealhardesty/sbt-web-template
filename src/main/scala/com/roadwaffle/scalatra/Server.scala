package com.example  // remember this package in the sbt project definition
import org.eclipse.jetty.server.{Server => JettyServer}
import org.eclipse.jetty.servlet.{DefaultServlet, ServletContextHandler}
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

// See http://www.scalatra.org/guides/deployment/standalone.html

object Server { 
  def main(args: Array[String]) {
    val port = if(System.getenv("PORT") != null) System.getenv("PORT").toInt else 8181

    val server = new JettyServer(port)
    val context = new WebAppContext()
    context setContextPath "/"
    context.setResourceBase("src/main/webapp")
    context.addEventListener(new ScalatraListener)
    context.addServlet(classOf[DefaultServlet], "/")

    server.setHandler(context)

    server.start

		println(s"Started Jetty server on port ${port}")
    server.join
  }
}

