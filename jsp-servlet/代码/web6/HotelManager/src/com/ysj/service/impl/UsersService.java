package com.ysj.service.impl;

import java.util.List;

import com.ysj.bean.Users;
import com.ysj.dao.IUsersDAO;
import com.ysj.dao.impl.UsersDAO;
import com.ysj.service.IUsersService;

public class UsersService implements IUsersService {

	IUsersDAO dao = new UsersDAO();
	
	@Override
	public boolean addUser(Users user) {
		return dao.addUser(user);
	}

	@Override
	public boolean deleteUser(Integer userid) {
		return dao.deleteUser(userid);
	}

	@Override
	public boolean updateUser(Users user) {
		return dao.updateUser(user);
	}

	@Override
	public List<Users> queryAllUsers(int page, int count) {
		return dao.queryAllUsers(page, count);
	}

	@Override
	public boolean queryUser(String username, String password, Integer usertype) {
		return dao.queryUser(username, password, usertype);
	}
	
	@Override
	public Integer getUsersCount() {
		return dao.getUsersCount();
	}

}
