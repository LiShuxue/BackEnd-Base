package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			request.setAttribute("username", username);
			request.setAttribute("usertype", usertype);
			request.getRequestDispatcher("users/user.jsp").forward(request, response);
			HttpSession session = request.getSession();
			session.setAttribute("operator", username);
			
		} else {
			response.setContentType("text/html;charset=utf-8");
			out.println("登录失败");//在servlet 中显示的时候要指定文档类型
		}
		
	}

}
