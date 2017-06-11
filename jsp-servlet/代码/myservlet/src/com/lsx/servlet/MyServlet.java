package com.lsx.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	@Override
	//获取请求参数都是用req
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取URL上携带的参数值
		//1.通过指定的参数名来获取该参数的值，名要和请求参数名对应
		String p1 = req.getParameter("param");
		String p2 = req.getParameter("param2");
		System.out.println("参数param=" + p1);
		System.out.println("参数param2=" + p2);
			
		System.out.println("-------getParameterNames---------");
		//2.获取所有的请求参数名，getParameterNames返回枚举对象,枚举就像一个迭代器一样，只是用来读取的
		//这种方法很少用，用于不知道参数名和值的情况下
		Enumeration<String> enumer = req.getParameterNames();
		while(enumer.hasMoreElements()){
			String name = enumer.nextElement();
			String value = req.getParameter(name);
			System.out.println(name + "=" + value);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//处理请求数据的中文乱码
		req.setCharacterEncoding("UTF-8");
		//获取表单提交的用户名和密码
		String name = req.getParameter("username");
		String pwd = req.getParameter("password");
		System.out.println("用户名：" + name);
		System.out.println("密码：" + pwd);

	}
}
