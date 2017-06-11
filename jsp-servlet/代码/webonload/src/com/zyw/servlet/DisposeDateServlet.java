package com.zyw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisposeDateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//用于调用业务处理其他表单元素，包括上传路径的处理
		//比如保存数据库，注：没有传上传路径至此
		String msg1 = (String)request.getAttribute("msg1");
		String msg2 = (String)request.getAttribute("msg2");
		System.out.println(msg1);
		System.out.println(msg2);
		//添加自己需要的方法。
		//显示上传文件
		response.sendRedirect("ShowFileServlet");
	}

}
