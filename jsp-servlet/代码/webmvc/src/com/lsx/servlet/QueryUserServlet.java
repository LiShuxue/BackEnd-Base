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
		
		//你也可以通过web.xml来获取配置参数，一个service的实现类的路径。来实例化具体的业务对象保存在接口变量。
		
		//正常下面的写法，省事。。
		IUsersService service = new UsersService();
		Users user = service.queryUser(id);
		if(user == null){
			request.setAttribute("tip", "没有该用户");
		}else{
			request.setAttribute("user", user);
		}
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}

}













