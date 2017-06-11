package com.zyw.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport {
	//����һ����������ļ���ͬ����File����
	private File uploadfile;
	//���Զ�Ҫ��uploadfile��ͷ�������Ӧ
	private String uploadfileContentType;	//�ļ�������
	private String uploadfileFileName;		//�ļ�������
	

	public String upload() throws Exception {
		//�õ���ǰ��Ŀ��Tomcat�µľ���·��+��/upload��
		String readPath = ServletActionContext.getServletContext().getRealPath("/upload");
		File file = new File(readPath);	//����·������һ���ļ�����
		if(!file.exists()){				//�ж����·�����ļ����Ƿ����
			file.mkdirs();				//�������·����mkdirs��s��˵����Ŀ¼û��Ҳ������
		}
		//�ϴ�����ļ���1���ϴ��ļ�����2�������ϵ�Ŀ����󣨴�����,Ŀ�꣩
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
