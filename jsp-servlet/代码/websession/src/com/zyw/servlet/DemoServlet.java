package com.zyw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String attr = request.getParameter("attr");
		if(null != attr && attr.equals("true")){
			HttpSession session = request.getSession();	//获取的是已有的session
			session.setAttribute("name", "zhangsan");
			session.setAttribute("name", "lisi");	//覆盖了之前的zhangsan
			session.removeAttribute("name");
			session.invalidate();
		}else{
			//获取了用户当前的session对象
			HttpSession session = request.getSession();
			session.invalidate();	//session销毁
		}
	}

}
