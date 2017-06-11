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
		//模拟登陆后存储的用户名
		HttpSession session = request.getSession();
		session.setAttribute("username", "lisi");
		
		//获取项目的绝对路径
		String rootPath = getServletContext().getRealPath("/");
		//获取参数上传路径
		String initPath = this.getInitParameter("path");
		//拼接完整上传路径
		String uploadPath = rootPath + initPath + session.getAttribute("username")+"\\";
		//保存缓存的路径
		String tempPath = this.getInitParameter("tempPath");
		//缓存大小
		int flushSize = Integer.parseInt(this.getInitParameter("flushSize"));
		//上传限制大小
		int fileSize = Integer.parseInt(this.getInitParameter("fileSize"));
		
		//创建上传数据物理文件夹
		File file = new File(uploadPath);
		if(!file.exists()){		//如果目录结构不存在，
			file.mkdirs();		//创建该目录
		}
		//创建缓存物理文件夹
		file = new File(tempPath);
		if(!file.exists()){
			file.mkdirs();
		}
		//表单类型是否是要上传
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if(!isMultipart){
			return;
		}
		
		//创建文件工厂（采用默认临界值和临时文件夹）
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//缓存大小
		factory.setSizeThreshold(flushSize);
		//临时文件夹，缓存目录
		factory.setRepository(file);
		//文件上传组件
		ServletFileUpload upload = new ServletFileUpload(factory);
		//文件大小
		upload.setFileSizeMax(fileSize);
		try {
			//请求中的所有元素
			List ls = upload.parseRequest(request);
			Iterator it = ls.iterator();
			while(it.hasNext()){
				FileItem item = (FileItem)it.next();
				//如果是文件域
				if(!item.isFormField()){
					String name = item.getName();
					
					//中文文件名，名字会乱码		File.separator 文件路径中的"/"
					name = name.substring(name.lastIndexOf(File.separator)+1, name.length());
					//文件名和文件大小无效
					if((name == null || "".equals(name)) && item.getSize() < 1){
						continue;
					}
					//获取扩展名
					String fileType = name.substring(name.indexOf("."));
					//获得唯一文件名，下方定义
					String fileName = this.getFileName();
					
					//执行上传	路径+文件名+扩展名
					item.write(new File(uploadPath + fileName + fileType));
					
				}else{
					//将所有非文件域，保存请求范围，下一个serlvet处理
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
		//处理非文件域的servlet
		request.getRequestDispatcher("DisposeDateServlet").forward(request, response);
	}
	
	/**
	 * 按时间创建唯一文件名
	 * @return
	 * @throws InterruptedException
	 */
	private String getFileName() throws InterruptedException{
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmmssms");
		Thread.sleep(1000);
		return sf.format(new Date());
	}

}
