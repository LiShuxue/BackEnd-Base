package com.lsx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String p1 = req.getParameter("param");
		String p2 = req.getParameter("param2");
		System.out.println("参数param=" + p1);
		System.out.println("参数param2=" + p2);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String p1 = req.getParameter("username");
		String p2 = req.getParameter("password");
		System.out.println("用户名：" + p1);
		System.out.println("密码：" + p2);
	}
}
