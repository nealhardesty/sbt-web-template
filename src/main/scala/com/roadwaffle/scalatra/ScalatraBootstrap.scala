// Scalatra seems to want this in the root package
import org.scalatra.LifeCycle
import javax.servlet.ServletContext

import com.roadwaffle.scalatra._

class ScalatraBootstrap extends LifeCycle {
	override def init(context: ServletContext) {
		context mount (new DefaultScalatraServlet, "/*")
	}
}
