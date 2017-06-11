package com.zyw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyw.service.IUsersService;
import com.zyw.service.impl.UsersService;

public class VaUNameServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获得add.jsp  ajax发来的用户名
		String username = request.getParameter("username");
		IUsersService service = new UsersService();
		PrintWriter out = response.getWriter();
		//通过用户名验证用户是否存在， 如果返回值null 表示不存在
		if(service.getUserByName(username) == null){
			out.print("可用");
		}else{
			out.print("不可用");
		}
	}

}
