package com.zyw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyw.bean.Users;
import com.zyw.service.IUsersService;
import com.zyw.service.impl.UsersService;

public class AddServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String birth = request.getParameter("birth");
		String phone = request.getParameter("phone");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = new Date(sf.parse(birth).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		IUsersService userService = new UsersService();
		int result = 0;
		if(  userService.addUser( new Users(0, uname, null, birthday, phone, false))  ){
			result = 1;
		}
		response.sendRedirect("add.jsp?result="+result);
	}

}
