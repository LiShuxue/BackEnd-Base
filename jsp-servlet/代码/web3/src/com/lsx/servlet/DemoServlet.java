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
		//��������������doPost��������
		//���۷�������get������post���󣬶���ִ��doPost��������
		this.doPost(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String path = null;
		if( (name != null && "lishuxue".equals(name)) && 
			(pwd != null && "111".equals(pwd)) ){
			//��¼�ɹ�����showҳ����ʾ����ӭXXX
			path = "show.jsp";
			//����¼�����͵�showҳ��,�Լ�ֵ�Ե���ʽ�����淢�͵����ݣ���Ŀ��ҳ��ͨ��key����ȡ����
			request.setAttribute("name", name);
		}else{
			//��¼ʧ�ܣ��ڵ�¼ҳ��index����ʾʧ����Ϣ
			path = "index.jsp";
			//tip ��key  "�û������������" ��value
			request.setAttribute("tip", "�û������������");
		}
		
		//��������ת��
		/*
		 * 1.ֻ����վ��ʹ��
		 * 2.��������ת�Ĺ�����Я������
		 * 3.��ת��ҳ��ˢ�£������ٴ�ִ��Servlet
		 */
		RequestDispatcher dis = request.getRequestDispatcher(path);
		dis.forward(request, response);
	}
}
