package com.lsx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//在这里调用下面的doPost（）方法
		//无论发来的是get请求还是post请求，都将执行doPost（）方法
		this.doPost(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String path = null;
		if( (name != null && "lishuxue".equals(name)) && 
			(pwd != null && "111".equals(pwd)) ){
			//登录成功，在show页面显示，欢迎XXX
			path = "show.jsp";
			//将登录名发送到show页面,以键值对的形式来保存发送的数据，在目标页面通过key来获取数据
			request.setAttribute("name", name);
		}else{
			//登录失败，在登录页面index，显示失败信息
			path = "index.jsp";
			//tip 是key  "用户名或密码错误" 就value
			request.setAttribute("tip", "用户名或密码错误");
		}
		
		//进行请求转发
		/*
		 * 1.只能在站内使用
		 * 2.可以在跳转的过程中携带对象
		 * 3.当转发页面刷新，将会再次执行Servlet
		 */
		RequestDispatcher dis = request.getRequestDispatcher(path);
		dis.forward(request, response);
	}
}
