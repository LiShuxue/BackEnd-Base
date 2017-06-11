package com.lsx.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	@Override
	//��ȡ�������������req
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��ȡURL��Я���Ĳ���ֵ
		//1.ͨ��ָ���Ĳ���������ȡ�ò�����ֵ����Ҫ�������������Ӧ
		String p1 = req.getParameter("param");
		String p2 = req.getParameter("param2");
		System.out.println("����param=" + p1);
		System.out.println("����param2=" + p2);
			
		System.out.println("-------getParameterNames---------");
		//2.��ȡ���е������������getParameterNames����ö�ٶ���,ö�پ���һ��������һ����ֻ��������ȡ��
		//���ַ��������ã����ڲ�֪����������ֵ�������
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
		//�����������ݵ���������
		req.setCharacterEncoding("UTF-8");
		//��ȡ���ύ���û���������
		String name = req.getParameter("username");
		String pwd = req.getParameter("password");
		System.out.println("�û�����" + name);
		System.out.println("���룺" + pwd);

	}
}
