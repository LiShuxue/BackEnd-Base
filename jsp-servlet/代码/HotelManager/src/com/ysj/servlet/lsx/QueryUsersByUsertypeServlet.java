package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Users;
import com.ysj.service.IUsersService;
import com.ysj.service.impl.UsersService;

public class QueryUsersByUsertypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer usertype = Integer.parseInt(request.getParameter("usertype"));
		IUsersService service = new UsersService();
		List<Users> list = service.queryUsersByType(usertype);
		request.setAttribute("list", list);
		request.setAttribute("totalPage", 0);
		request.getRequestDispatcher("/users/showUsers.jsp").forward(request, response);
	}

}
