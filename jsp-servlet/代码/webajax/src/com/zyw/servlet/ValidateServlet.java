package com.zyw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		// 通过 out 对象 来完成 ajax的响应
		// 这里也可以重定向，将一个网页响应给 请求的页面
		if(uname != null && uname.equals("haochen")){
			out.print("error");
		}else{
			//out.print("ok");
			response.sendRedirect("response.jsp");
		}

	}

}
