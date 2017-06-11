package com.zyw.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport {
	//定义一个名字与表单文件域同名的File对象
	private File uploadfile;
	//属性都要以uploadfile开头，必须对应
	private String uploadfileContentType;	//文件的类型
	private String uploadfileFileName;		//文件的名字
	

	public String upload() throws Exception {
		//得到当前项目在Tomcat下的绝对路径+“/upload”
		String readPath = ServletActionContext.getServletContext().getRealPath("/upload");
		File file = new File(readPath);	//根据路径创建一个文件对象
		if(!file.exists()){				//判断这个路径（文件）是否存在
			file.mkdirs();				//生成这个路径，mkdirs加s，说明父目录没有也会生成
		}
		//上传这个文件，1你上传文件对象，2服务器上的目标对象（存在哪,目标）
		FileUtils.copyFile(uploadfile, new File(file, uploadfileFileName));
		return SUCCESS;
	}
	
	
	public File getUploadfile() {
		return uploadfile;
	}


	public void setUploadfile(File uploadfile) {
		this.uploadfile = uploadfile;
	}


	public String getUploadfileContentType() {
		return uploadfileContentType;
	}


	public void setUploadfileContentType(String uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}


	public String getUploadfileFileName() {
		return uploadfileFileName;
	}


	public void setUploadfileFileName(String uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}


	public static void main(String[] args) {
		
	}
	
	
}
