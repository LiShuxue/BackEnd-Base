package com.zyw.service.impl;

import java.util.List;

import com.zyw.bean.Users;
import com.zyw.dao.IUsersDAO;
import com.zyw.dao.impl.UsersDAO;
import com.zyw.service.IUsersService;

public class UsersService implements IUsersService{

	private IUsersDAO userdao = new UsersDAO();
	
	@Override
	public boolean addUser(Users user) {
		Users u = userdao.getUserByName(user.getUsername());
		if(u == null){
			userdao.add(user);
			return true;
		}
		return false;
	}

	@Override
	public List<Users> queryUsers(int page, int count) {
		// TODO Auto-generated method stub
		return userdao.queryUsers(page, count);
	}

	@Override
	public Integer getUsersCount() {
		// TODO Auto-generated method stub
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

	@Override
	public Users getUserByName(String uname) {
		// TODO Auto-generated method stub
		return userdao.getUserByName(uname);
	}
	
	
	
	
}










