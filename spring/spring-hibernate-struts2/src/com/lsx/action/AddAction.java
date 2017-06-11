package com.lsx.action;

import com.lsx.bean.Stu;
import com.lsx.service.IStuService;
//ע�⵼���xwork2�İ�
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	
	//ͨ����������ʽ��ֵ����ҳ���ϵ�ֵ��ȡ����Ϊ�������ֵ��ҳ��ؼ���name=ģ�Ͷ���.������
	private Stu stu;
	private IStuService service;

	@Override
	public String execute() throws Exception {
		if(service.addStu(stu)) {
			return SUCCESS;
		}
		return INPUT;
	}
	
	public Stu getStu() {
		return stu;
	}
	
	public void setStu(Stu stu) {
		this.stu = stu;
	}
	
	public IStuService getService() {
		return service;
	}
	
	public void setService(IStuService service) {
		this.service = service;
	}
	
}
