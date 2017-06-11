package com.ysj.servlet.lsx;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysj.bean.Users;
import com.ysj.service.IUsersService;
import com.ysj.service.impl.UsersService;

public class QueryUsersServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IUsersService service = new UsersService();
		Integer usersCount = service.getUsersCount();
		Integer count = 5 ;
		Integer totalPage = (usersCount % count==0) ? (usersCount/count) : (usersCount/count + 1);
		
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
		
		List<Users> list = service.queryAllUsers(page, count);

		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("/users/showUsers.jsp").forward(request, response);
	}

}
