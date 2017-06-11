package com.lsx.dao;


import java.util.List;

import com.lsx.bean.Users;

public interface IUsersDAO {
	/**
	 * 添加用户
	 */
	public void addUser(Users user);
	
	/**
	 * 根据用户名查找用户
	 */
	public Users getUserByName(String username);
	
	/**
	 * 查询用户，所有的用户.
	 * 当前页数page
	 * 显示条数count
	 */
	public List<Users> queryUsers(int page, int count);
	
	/**
	 * 获取用户总人数
	 */
	public Integer getUsersCount();
	
	/**
	 * 修改用户
	 */
	public void updateUser(Users user);
	
	/**
	 * 删除用户
	 */
	public void deleteUser(Integer id);
}
