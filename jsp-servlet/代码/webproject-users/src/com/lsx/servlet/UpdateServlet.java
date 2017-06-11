package com.lsx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lsx.bean.Users;
import com.lsx.service.IUsersService;
import com.lsx.service.impl.UsersService;

public class UpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String strBirthDay = request.getParameter("birthday");
		String phone = request.getParameter("phone");
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = birthday = new Date(sf.parse(strBirthDay).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		IUsersService service = new UsersService();
		Users user = new Users(0, username, password, birthday, phone, false);
		
		if(service.updateUser(user)){
			PrintWriter out = response.getWriter();
			out.print("ÐÞ¸Ä³É¹¦");
		}
	}

}
