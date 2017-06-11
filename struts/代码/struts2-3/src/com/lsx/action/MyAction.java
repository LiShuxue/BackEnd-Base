package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

	private Users user = new Users();

	@Override
	public String execute() throws Exception {
		System.out.println("处理请求MyAction");
		//获取属性user 的属性 是否接收到表单的请求数据
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
