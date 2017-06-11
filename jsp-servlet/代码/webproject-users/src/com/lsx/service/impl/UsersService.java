package com.lsx.service.impl;

import java.util.List;

import com.lsx.bean.Users;
import com.lsx.dao.IUsersDAO;
import com.lsx.dao.impl.UsersDAO;
import com.lsx.service.IUsersService;

public class UsersService implements IUsersService {
	
	private IUsersDAO userdao = new UsersDAO();

	@Override
	public boolean addUser(Users user) {
		Users u = userdao.getUserByName(user.getUsername());
		if(u == null) {
			userdao.addUser(user);
			return true;
		}
		return false;
	}

	@Override
	public Users getUserByName(String username) {
		return userdao.getUserByName(username);
	}

	@Override
	public List<Users> queryUsers(int page, int count) {
		return userdao.queryUsers(page, count);
	}

	@Override
	public Integer getUsersCount() {
		return userdao.getUsersCount();
	}

	@Override
	public boolean updateUser(Users user) {
		userdao.updateUser(user);
		return true;
	}

	@Override
	public boolean deleteUser(Integer id) {
		userdao.deleteUser(id);
		return true;
	}

}
