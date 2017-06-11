package com.lsx.service;

import java.util.List;

import com.lsx.bean.Users;

public interface IUsersService {
	/**
	 * 添加用户
	 */
	public boolean addUser(Users user);
	
	/**
	 * 通过用户名查用户
	 */
	public Users getUserByName(String username);
	
	/**
	 * 查询用户
	 */
	public List<Users> queryUsers(int page, int count);
	
	/**
	 * 获得用户总人数
	 */
	public Integer getUsersCount();
	
	/**
	 * 修改用户信息
	 */
	public boolean updateUser(Users user);
	
	/**
	 * 删除用户
	 */
	public boolean deleteUser(Integer id);
}
