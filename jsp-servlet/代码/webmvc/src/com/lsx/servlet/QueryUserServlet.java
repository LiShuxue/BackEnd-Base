package com.lsx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lsx.bean.Users;
import com.lsx.service.IUsersService;
import com.lsx.service.impl.UsersService;

public class QueryUserServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.parseInt( request.getParameter("id").trim() );
		
		//��Ҳ����ͨ��web.xml����ȡ���ò�����һ��service��ʵ�����·������ʵ���������ҵ����󱣴��ڽӿڱ�����
		
		//���������д����ʡ�¡���
		IUsersService service = new UsersService();
		Users user = service.queryUser(id);
		if(user == null){
			request.setAttribute("tip", "û�и��û�");
		}else{
			request.setAttribute("user", user);
		}
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}

}













