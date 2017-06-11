package com.zyw.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ģ���½��洢���û���
		HttpSession session = request.getSession();
		session.setAttribute("username", "lisi");
		
		//��ȡ��Ŀ�ľ���·��
		String rootPath = getServletContext().getRealPath("/");
		//��ȡ�����ϴ�·��
		String initPath = this.getInitParameter("path");
		//ƴ�������ϴ�·��
		String uploadPath = rootPath + initPath + session.getAttribute("username")+"\\";
		//���滺���·��
		String tempPath = this.getInitParameter("tempPath");
		//�����С
		int flushSize = Integer.parseInt(this.getInitParameter("flushSize"));
		//�ϴ����ƴ�С
		int fileSize = Integer.parseInt(this.getInitParameter("fileSize"));
		
		//�����ϴ����������ļ���
		File file = new File(uploadPath);
		if(!file.exists()){		//���Ŀ¼�ṹ�����ڣ�
			file.mkdirs();		//������Ŀ¼
		}
		//�������������ļ���
		file = new File(tempPath);
		if(!file.exists()){
			file.mkdirs();
		}
		//�������Ƿ���Ҫ�ϴ�
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if(!isMultipart){
			return;
		}
		
		//�����ļ�����������Ĭ���ٽ�ֵ����ʱ�ļ��У�
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//�����С
		factory.setSizeThreshold(flushSize);
		//��ʱ�ļ��У�����Ŀ¼
		factory.setRepository(file);
		//�ļ��ϴ����
		ServletFileUpload upload = new ServletFileUpload(factory);
		//�ļ���С
		upload.setFileSizeMax(fileSize);
		try {
			//�����е�����Ԫ��
			List ls = upload.parseRequest(request);
			Iterator it = ls.iterator();
			while(it.hasNext()){
				FileItem item = (FileItem)it.next();
				//������ļ���
				if(!item.isFormField()){
					String name = item.getName();
					
					//�����ļ��������ֻ�����		File.separator �ļ�·���е�"/"
					name = name.substring(name.lastIndexOf(File.separator)+1, name.length());
					//�ļ������ļ���С��Ч
					if((name == null || "".equals(name)) && item.getSize() < 1){
						continue;
					}
					//��ȡ��չ��
					String fileType = name.substring(name.indexOf("."));
					//���Ψһ�ļ������·�����
					String fileName = this.getFileName();
					
					//ִ���ϴ�	·��+�ļ���+��չ��
					item.write(new File(uploadPath + fileName + fileType));
					
				}else{
					//�����з��ļ��򣬱�������Χ����һ��serlvet����
					String name = item.getFieldName();
					String value = item.getString("UTF-8");
					request.setAttribute(name, value);
				}
				
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//������ļ����servlet
		request.getRequestDispatcher("DisposeDateServlet").forward(request, response);
	}
	
	/**
	 * ��ʱ�䴴��Ψһ�ļ���
	 * @return
	 * @throws InterruptedException
	 */
	private String getFileName() throws InterruptedException{
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmmssms");
		Thread.sleep(1000);
		return sf.format(new Date());
	}

}
