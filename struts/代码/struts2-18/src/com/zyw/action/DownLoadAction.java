package com.zyw.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport{

	private String downfile;		//���ص��ļ���������������ṩ
	private String filePath;		//�ļ�����·������ԣ�,��struts.xml������
	
	//���Լ�Ҫ��дһ��get
	public InputStream getInputStream(){
		//Ϊ���ṩ��������ĳ���ļ���������	filePath+downfile����Ŀ/upload/test.rar������ļ������ڷ������ڴ���
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
