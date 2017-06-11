package com.lsx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Id;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lsx.service.IUsersService;
import com.lsx.service.impl.UsersService;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		String page = request.getParameter("page");
		IUsersService service = new UsersService();
		if(service.deleteUser(id)) {
			response.sendRedirect("QueryUsers?page=" + page);
		}
	}
}
