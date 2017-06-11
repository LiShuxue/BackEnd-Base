package com.lsx.bean;

import java.sql.Date;

public class Users {

	private Integer id;
	private String username;
	private String password;
	private Date birthday;
	private String phone;
	private boolean isdel;
	
	public Users(Integer id, String username, String password, Date birthday,
			String phone, boolean isdel) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.birthday = birthday;
		this.phone = phone;
		this.isdel = isdel;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isIsdel() {
		return isdel;
	}

	public void setIsdel(boolean isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return this.username;
	}
	
	
}
