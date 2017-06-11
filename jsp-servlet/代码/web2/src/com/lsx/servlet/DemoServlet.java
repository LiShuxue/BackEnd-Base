package com.lsx.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet生命周期：
 * Servlet在第一次被访问的时候，加载Servlet、实例化对象、调初始化方法init
 * 之后的每次访问仅仅只做请求的处理
 * 当服务器关闭的时候，会对所有的Servlet进行销毁
 * 当服务器在运行的过程中，他只会维护一个Servlet的实例。用这个实例来处理所有用户的请求
 * 每一个用户访问服务器，服务器就会为该用户开辟一个新的线程，也就是说，所有的线程共享一个Servlet
 * 在Servlet里不能去定义类的属性，这样会发生并发错误
 */
public class DemoServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//具体需要初始化什么东西，自己去写，如需要用流读取某个文件等等
		System.out.println("DemoServlet init");
	}
	
	@Override
	public void destroy() {
		//只有在正常关闭服务器的时候才会执行，强退的时候不执行
		//可以在这个方法里写一些内容，去关闭一些流什么的，就是结束的时候需要执行什么，就写在这里面
		System.out.println("DemoServlet destroy");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DemoServlet get请求处理");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DemoServlet post请求处理");
	}
}
