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
		
		//���ڵ���ҵ����������Ԫ�أ������ϴ�·���Ĵ���
		//���籣�����ݿ⣬ע��û�д��ϴ�·������
		String msg1 = (String)request.getAttribute("msg1");
		String msg2 = (String)request.getAttribute("msg2");
		System.out.println(msg1);
		System.out.println(msg2);
		//����Լ���Ҫ�ķ�����
		//��ʾ�ϴ��ļ�
		response.sendRedirect("ShowFileServlet");
	}

}
