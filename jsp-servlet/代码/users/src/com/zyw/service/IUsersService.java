package com.zyw.service;

import java.util.List;

import com.zyw.bean.Users;

public interface IUsersService {
	/**
	 * 添加用户
	 * @param user
	 */
	public boolean addUser(Users user);
	
	/**
	 * 查询用户
	 */
	public List<Users> queryUsers(int page,int count);
	
	/**
	 * 获得用户总人数
	 */
	public Integer getUsersCount();
	
	/**
	 * 用户信息更新
	 */
	public boolean updateUser(Users user);
	
	/**
	 * 删除用户
	 */
	public boolean deleteUser(Integer id);
	
	/**
	 * 通过用户名查用户
	 * @param uname
	 * @return
	 */
	public Users getUserByName(String uname);
}
