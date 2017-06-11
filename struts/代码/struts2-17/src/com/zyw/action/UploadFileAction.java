package com.zyw.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport {
	//通过struts内置的类型转换，将3个文件域中的文件保存在数组里
	private File[] uploadfile;
	//属性都要以uploadfile开头
	private String[] uploadfileContentType;
	private String[] uploadfileFileName;
	
	public String upload() throws Exception {
		String readPath = ServletActionContext.getServletContext().getRealPath("/upload");
		File file = new File(readPath);
		if(!file.exists()){
			file.mkdirs();
		}
		for(int i=0; i<uploadfile.length; i++){
			FileUtils.copyFile(uploadfile[i], new File(file, uploadfileFileName[i]));
		}
		
		return SUCCESS;
	}

	public File[] getUploadfile() {
		return uploadfile;
	}



	public void setUploadfile(File[] uploadfile) {
		this.uploadfile = uploadfile;
	}



	public String[] getUploadfileContentType() {
		return uploadfileContentType;
	}



	public void setUploadfileContentType(String[] uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}



	public String[] getUploadfileFileName() {
		return uploadfileFileName;
	}



	public void setUploadfileFileName(String[] uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}
	
}
