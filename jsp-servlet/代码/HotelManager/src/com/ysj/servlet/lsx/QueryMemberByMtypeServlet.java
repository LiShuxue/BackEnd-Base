package com.ysj.servlet.lsx;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Members;
import com.ysj.service.IMembersService;
import com.ysj.service.impl.MembersService;

public class QueryMemberByMtypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mtype = request.getParameter("mtype").toUpperCase();
		IMembersService service = new MembersService();
		List<Members> list = service.queryMemberByType(mtype);
		request.setAttribute("list", list);
		request.setAttribute("totalPage", 0);
		request.getRequestDispatcher("/members/showMembers.jsp").forward(request, response);
	}

}
