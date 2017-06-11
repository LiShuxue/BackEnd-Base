package com.lsx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//创建一个cookie对象，提供一个键值对
		Cookie c = new Cookie("name", "lisi");
		//设置有效期5秒
		c.setMaxAge(5);
		//使cookie生效，响应时添加这个cookie
		response.addCookie(c);
		response.sendRedirect("showCookie.jsp");
	}

}
