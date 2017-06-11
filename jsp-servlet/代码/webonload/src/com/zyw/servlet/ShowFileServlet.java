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
		//获得服务器跟目录，绝对路径
		String path = request.getServletContext().getRealPath("/");
		//配置的路径
		String uploadPath = this.getInitParameter("path");
		//存放目录下所有文件文件名
		List<String> fileList = new ArrayList<String>();
		//上传文件所存路径
		String filePath = path + uploadPath + request.getSession().getAttribute("username");
		File file = new File(filePath);
		//判断文件夹是否存在，是否是一个目录
		if(file.exists() && file.isDirectory()){
			//获取目录下所有文件
			File[] files = file.listFiles();
			for(File f: files){
				//如果是一个文件
				if(f.isFile()){
					//存入集合
					fileList.add(f.getName());
				}
			}
		}
		
		request.setAttribute("fileList", fileList);
		request.getRequestDispatcher("showFile.jsp").forward(request, response);
	}

}
