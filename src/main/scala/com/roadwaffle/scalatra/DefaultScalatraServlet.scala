package com.roadwaffle.scalatra

import org.scalatra._

class DefaultScalatraServlet extends ScalatraServlet {

	get("/") {
		<html>
			<body>
				Hello
			</body>
		</html>
	}

	notFound {
		<html>
			<body>
				NotFound
			</body>
		</html>

	}

}
