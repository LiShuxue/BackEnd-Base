package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

	private Users user = new Users();

	@Override
	public String execute() throws Exception {
		System.out.println("��������MyAction");
		//��ȡ����user ������ �Ƿ���յ�������������
		System.out.println("username:" + user.getUsername());
		System.out.println("password:" + user.getPassword());
		return SUCCESS;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
