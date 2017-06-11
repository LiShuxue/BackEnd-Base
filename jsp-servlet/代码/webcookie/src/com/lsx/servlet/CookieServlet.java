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

		//����һ��cookie�����ṩһ����ֵ��
		Cookie c = new Cookie("name", "lisi");
		//������Ч��5��
		c.setMaxAge(5);
		//ʹcookie��Ч����Ӧʱ������cookie
		response.addCookie(c);
		response.sendRedirect("showCookie.jsp");
	}

}
