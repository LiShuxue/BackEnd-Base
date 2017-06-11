package com.zyw.service.impl;

import com.zyw.bean.Demo1User;
import com.zyw.dao.IUserDAO;
import com.zyw.service.IUserService;

public class UserService implements IUserService{

	private IUserDAO userDAO;
	
	@Override
	public void insert(Demo1User user) {
		
		userDAO.insert(user);
		userDAO.update();
	}

	@Override
	public Demo1User find(Integer id) {
		return userDAO.find(id);
	}



	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
}
