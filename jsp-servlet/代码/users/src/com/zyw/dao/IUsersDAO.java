package com.zyw.dao;

import java.util.List;

import com.zyw.bean.Users;

public interface IUsersDAO {

	/**
	 * 添加用户
	 * @param user
	 */
	public void add(Users user);
	
	/**
	 * 通过用户名查用户
	 * @param uname
	 * @return
	 */
	public Users getUserByName(String uname);
	
	/**
	 * 查询用户
	 * @param page 当前页数
	 * @param count  显示条数
	 * @return
	 */
	public List<Users> queryUsers(int page,int count);
	
	/**
	 * 获取用户总人数
	 */
	public Integer getUsersCount();
	
	/**
	 * 修改用户信息
	 */
	public void updateUser(Users user);
	
	/**
	 * 删除用户
	 */
	public void deleteUser(Integer id);
}




