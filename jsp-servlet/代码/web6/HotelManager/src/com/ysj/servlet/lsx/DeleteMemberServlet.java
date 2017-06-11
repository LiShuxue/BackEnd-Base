package com.ysj.servlet.lsx;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.service.IMembersService;
import com.ysj.service.impl.MembersService;

public class DeleteMemberServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer mid = Integer.parseInt(request.getParameter("mid"));
		String page = request.getParameter("page");
		IMembersService service = new MembersService();
		if(service.deleteMember(mid)) {
			response.sendRedirect("QueryMembersServlet?page=" + page);
		}
	}

}
