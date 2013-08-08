package com.roadwaffle.scalatra

import org.scalatra._
import org.scalatra.scalate.ScalateSupport

class DefaultScalatraServlet extends ScalatraServlet with ScalateSupport {

	get("/") {
		contentType = "text/html"

		ssp("/index", "who" -> "World")
		// layoutTemplate("/WEB-INF/templates/views/index.ssp")
	}

	notFound {
		<html>
			<body>
				NotFound
			</body>
		</html>

	}

}
