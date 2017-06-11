package com.zyw.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zyw.bean.Demo1User;
import com.zyw.dao.IUserDAO;
import com.zyw.service.IUserService;

public class UserService implements IUserService{

	private IUserDAO userDAO;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void insert(Demo1User user) {
		
		userDAO.insert(user);
		userDAO.update();
	}

	@Override
	@Transactional(readOnly = true)
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
