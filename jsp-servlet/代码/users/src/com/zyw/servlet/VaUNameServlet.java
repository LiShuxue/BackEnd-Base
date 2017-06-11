package com.zyw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyw.service.IUsersService;
import com.zyw.service.impl.UsersService;

public class VaUNameServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//���add.jsp  ajax�������û���
		String username = request.getParameter("username");
		IUsersService service = new UsersService();
		PrintWriter out = response.getWriter();
		//ͨ���û�����֤�û��Ƿ���ڣ� �������ֵnull ��ʾ������
		if(service.getUserByName(username) == null){
			out.print("����");
		}else{
			out.print("������");
		}
	}

}
