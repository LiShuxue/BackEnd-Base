package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Users;
import com.ysj.service.IUsersService;
import com.ysj.service.impl.UsersService;

public class AddUserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		Integer userType = Integer.parseInt(request.getParameter("userType"));
		String remark = request.getParameter("remark");
	
		IUsersService service = new UsersService();
		Users user = new Users(0, username, null, userType, remark, 0);
		
		PrintWriter out = response.getWriter();
		if(service.addUser(user)){
			out.print("添加成功");
		} else {
			out.print("添加失败");
		}
	}

}
