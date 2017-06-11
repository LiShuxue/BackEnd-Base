package com.lsx.action;

import com.lsx.bean.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	//通过域驱动模式去存取请求参数，需要对此user对象生成get/set方法
	private Users user = new Users();
	
	//action执行的具体操作
	@Override
	public String execute() throws Exception {
		//判断用户名密码是否符合规定，符合就可以登录
		if ("admin".equals(user.getUsername()) && "123".equals(user.getPassword())
				|| "lisi".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			
			//登录的时候先将这个user对象存在session中。ActionContext.getContext()可以获得请求对象request（map类型）
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}
		//如果用户名密码错误，登录失败，跳转到登录页面，并显示提示信息
		ActionContext.getContext().put("msg", "用户名或密码错误");
		return INPUT;
	}
	
	public void setUser(Users user) {
		this.user = user;
	}
	
	public Users getUser() {
		return user;
	}
}
