package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MyAction extends ActionSupport implements ModelDriven<Users>{
	//�����Կ���û��get/set����
	private Users user = new Users();

	@Override
	public Users getModel() {
		//ֱ�ӷ�������user
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("��������MyAction");
		//��ȡ����user ������ �Ƿ���յ�������������
		System.out.println("username:" + user.getUsername());
		System.out.println("password:" + user.getPassword());
		return SUCCESS;
	}

}
