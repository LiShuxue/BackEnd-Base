package com.ysj.service;

import java.util.List;

import com.ysj.bean.Users;

public interface IUsersService {

	/**
	 * 增加用户
	 */
	public boolean addUser(Users user);
	
	/**
	 * 删除用户，根据用户的ID编号
	 */
	public boolean deleteUser(Integer userid);
	
	/**
	 * 修改用户
	 */
	public boolean updateUser(Users user);
	
	/**
	 * 查询所有用户信息
	 */
	public List<Users> queryAllUsers(int page, int count);
	
	/**
	 * 查询某个用户信息，根据用户名，密码，和用户类别（角色）
	 */
	public boolean queryUser(String username, String password, Integer usertype);
	
	/**
	 * 获得用户的总数
	 */
	public Integer getUsersCount();
}
