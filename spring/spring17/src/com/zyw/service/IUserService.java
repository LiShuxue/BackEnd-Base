package com.zyw.service;

import com.zyw.bean.Demo1User;

public interface IUserService {

	public void insert(Demo1User user);
	
	public Demo1User find(Integer id);
}
