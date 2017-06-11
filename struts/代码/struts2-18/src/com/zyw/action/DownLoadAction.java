package com.zyw.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport{

	private String downfile;		//下载的文件名，由请求参数提供
	private String filePath;		//文件所在路径（相对）,从struts.xml中设置
	
	//你自己要编写一个get
	public InputStream getInputStream(){
		//为你提供服务器上某个文件的流对象	filePath+downfile（项目/upload/test.rar）这个文件流已在服务器内存中
		return ServletActionContext.getServletContext().getResourceAsStream(filePath+downfile);
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(this.filePath);
		return SUCCESS;
	}

	public String getDownfile() {
		return downfile;
	}

	public void setDownfile(String downfile) {
		this.downfile = downfile;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}
