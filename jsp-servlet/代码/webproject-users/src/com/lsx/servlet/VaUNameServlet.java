package com.lsx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PUT;

import com.lsx.service.IUsersService;
import com.lsx.service.impl.UsersService;

public class VaUNameServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		IUsersService service = new UsersService();
		PrintWriter out = response.getWriter();
		if(service.getUserByName(username) == null) {
			out.print("可用");
		} else {
			out.print("不可用");
		}
		
	}

}
