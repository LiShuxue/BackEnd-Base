package com.zyw.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.filefilter.FileFilterUtils;

public class DownLoadServlet extends HttpServlet {

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
		//上传文件所存路径
		String filePath = path+uploadPath+request.getSession().getAttribute("username") + "\\";
		//参数文件名
		String fileName = request.getParameter("filename");
		File file = new File(filePath + fileName);
		//文件存在
		if(file.exists()){
			//设置响应类型和响应头
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
			//读取文件
			InputStream is = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(is);
			byte[] buff = new byte[1024];
			OutputStream os = response.getOutputStream();	//向客户端输出流信息
			BufferedOutputStream bos = new BufferedOutputStream(os);
			int len = 0;
			while((len = is.read(buff)) != -1){
				bos.write(buff, 0, len);
			}
			bos.close();
			os.close();
			bis.close();
			is.close();
			
			
		}
		
	}

}
