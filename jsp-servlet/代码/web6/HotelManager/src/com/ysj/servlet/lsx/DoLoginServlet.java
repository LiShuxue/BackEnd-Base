package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.service.IUsersService;
import com.ysj.service.impl.UsersService;

public class DoLoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Integer usertype = Integer.parseInt(request.getParameter("usertype"));
		
		IUsersService service = new UsersService();
		PrintWriter out = response.getWriter();
		
//		System.out.println(username);
//		System.out.println(password);
//		System.out.println(usertype);
//		System.out.println(service.queryUser(username, password, usertype));
		if(service.queryUser(username, password, usertype)) {
			if (usertype == 1) {
				response.sendRedirect("users/user1.jsp");
			} else if (usertype == 2) {
				response.sendRedirect("users/user2.jsp");
			} else if (usertype == 3) {
				response.sendRedirect("users/user3.jsp");
			}
			
		} else {
			response.setContentType("text/html;charset=utf-8");
			out.println("登录失败");//在servlet 中显示的时候要指定文档类型
		}
		
	}

}
