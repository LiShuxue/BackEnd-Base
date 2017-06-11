package com.ysj.servlet.lsx;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Members;
import com.ysj.service.IMembersService;
import com.ysj.service.impl.MembersService;

public class QueryMembersServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IMembersService service = new MembersService();
		Integer membersCount = service.getMembersCount();
		Integer count = 10 ;
		Integer totalPage = (membersCount % count==0) ? (membersCount/count) : (membersCount/count + 1);
		
		String strPage = request.getParameter("page");
		Integer page = 0;
		try{
			page = strPage == null ? 1 : Integer.parseInt(strPage);
		}catch(Exception e){
			page = 1;
		}
		
		if(page < 1){
			page = 1;
		}else if(page > totalPage){
			page = totalPage;
		}
		
		List<Members> list = service.queryAllMembers(page, count);

		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("/members/showMembers.jsp").forward(request, response);
		
	}

}
