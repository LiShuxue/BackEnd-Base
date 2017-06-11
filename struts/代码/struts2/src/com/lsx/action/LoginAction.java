package com.lsx.action;

import com.lsx.service.IUserService;
import com.lsx.service.UserService;

/**
 * 程序的控制器，可以是一个普通的java类
 */
public class LoginAction {
	
	private IUserService service = new UserService();
	
	//定义两个属性，他们的名字和页面index表单控件名相同,get/set方法
	private String username;
	private String password;
	
	public String login() {
		//以前需要getParameter方法获得值，现在不用，自动会保存在这两个变量中
		if(service.login(username, password)) {
			return "ok";  //返回的这个字符串实际上是一个逻辑视图名，与struts中的<result name="">对应
		}
		return "error";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
