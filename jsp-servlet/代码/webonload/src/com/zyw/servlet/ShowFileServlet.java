package com.zyw.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowFileServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��÷�������Ŀ¼������·��
		String path = request.getServletContext().getRealPath("/");
		//���õ�·��
		String uploadPath = this.getInitParameter("path");
		//���Ŀ¼�������ļ��ļ���
		List<String> fileList = new ArrayList<String>();
		//�ϴ��ļ�����·��
		String filePath = path + uploadPath + request.getSession().getAttribute("username");
		File file = new File(filePath);
		//�ж��ļ����Ƿ���ڣ��Ƿ���һ��Ŀ¼
		if(file.exists() && file.isDirectory()){
			//��ȡĿ¼�������ļ�
			File[] files = file.listFiles();
			for(File f: files){
				//�����һ���ļ�
				if(f.isFile()){
					//���뼯��
					fileList.add(f.getName());
				}
			}
		}
		
		request.setAttribute("fileList", fileList);
		request.getRequestDispatcher("showFile.jsp").forward(request, response);
	}

}
