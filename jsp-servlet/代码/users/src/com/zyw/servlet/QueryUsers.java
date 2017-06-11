package com.zyw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyw.bean.Users;
import com.zyw.service.IUsersService;
import com.zyw.service.impl.UsersService;

public class QueryUsers extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IUsersService service = new UsersService();
		Integer usersCount = service.getUsersCount();
		Integer count = 10;	//ø…xml≈‰÷√
		Integer totalPage = usersCount % count == 0 
				? usersCount / count
				: usersCount / count + 1;
		
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
		
		List<Users> list = service.queryUsers(page, count);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("manager.jsp").forward(request, response);
	}

}
