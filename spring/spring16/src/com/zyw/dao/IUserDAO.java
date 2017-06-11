package com.zyw.dao;

import com.zyw.bean.Demo1User;

public interface IUserDAO {

	public void insert(Demo1User user);
	
	public Demo1User find(Integer id);
}
