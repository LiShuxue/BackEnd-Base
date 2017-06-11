package com.ysj.servlet.lsx;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.service.IUsersService;
import com.ysj.service.impl.UsersService;

public class DeleteUserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer userid = Integer.parseInt(request.getParameter("userId"));
		String page = request.getParameter("page");
		IUsersService service = new UsersService();
		if(service.deleteUser(userid)) {
			response.sendRedirect("QueryUsersServlet?page=" + page);
		}
	}

}
