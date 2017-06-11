package com.lsx.bean;

/**
 * 域驱动模式，需要先建一个跟表单中请求参数对应的实体类
 */
public class Users {
	
	private String username;
	private String password;
	
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
