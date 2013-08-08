package com.roadwaffle.sbtjettytemplate

import org.eclipse.jetty.server.{Server => JettyServer}
import org.eclipse.jetty.servlet.ServletHandler
import com.roadwaffle.sbtjettytemplate.servlet._

object Server {
  def main(args: Array[String]) {
	    val server = new JettyServer(8181)
			val handler = new ServletHandler()
			server.setHandler(handler)

			handler.addServletWithMapping(classOf[HelloServlet], "/*")

			server.start()
			println("started server on 8181")
			server.join()
	}
}

