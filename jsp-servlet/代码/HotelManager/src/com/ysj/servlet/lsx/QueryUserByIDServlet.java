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

public class QueryUserByIDServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer userid = Integer.parseInt(request.getParameter("userid"));
		IUsersService service = new UsersService();
		Users user = service.queryUserById(userid);
		List<Users> list = new ArrayList<Users>();
		list.add(user);
		request.setAttribute("list", list);
		request.setAttribute("totalPage", 0);
		request.getRequestDispatcher("/users/showUsers.jsp").forward(request, response);
	}

}
