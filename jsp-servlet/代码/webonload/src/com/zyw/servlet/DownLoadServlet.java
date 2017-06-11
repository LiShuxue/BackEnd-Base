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

		//��÷�������Ŀ¼������·��
		String path = request.getServletContext().getRealPath("/");
		//���õ�·��
		String uploadPath = this.getInitParameter("path");
		//�ϴ��ļ�����·��
		String filePath = path+uploadPath+request.getSession().getAttribute("username") + "\\";
		//�����ļ���
		String fileName = request.getParameter("filename");
		File file = new File(filePath + fileName);
		//�ļ�����
		if(file.exists()){
			//������Ӧ���ͺ���Ӧͷ
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
			//��ȡ�ļ�
			InputStream is = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(is);
			byte[] buff = new byte[1024];
			OutputStream os = response.getOutputStream();	//��ͻ����������Ϣ
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
