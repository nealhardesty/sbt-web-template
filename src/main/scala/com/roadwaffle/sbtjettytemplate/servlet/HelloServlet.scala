package com.roadwaffle.sbtjettytemplate.servlet

import javax.servlet.http.{HttpServletResponse, HttpServletRequest, HttpServlet}

class HelloServlet extends HttpServlet {
  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {
	    response.getWriter().println(s"Hello ${request.getRemoteHost}")
	}
}

