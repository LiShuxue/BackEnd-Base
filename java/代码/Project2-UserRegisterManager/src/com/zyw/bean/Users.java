package com.zyw.bean;

/**
 * 
 * 1.����
 * 2.��/�� �����Ĺ���
 * 3.���Ե�set/get����
 *
 */
public class Users {
	private Integer id;
	private String username;
	private String password;
	private int age;
	
	public Users(Integer id, String username, String password, int age) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public Users() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
