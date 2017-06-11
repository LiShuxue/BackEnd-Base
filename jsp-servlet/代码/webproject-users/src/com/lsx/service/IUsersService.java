package com.lsx.service;

import java.util.List;

import com.lsx.bean.Users;

public interface IUsersService {
	/**
	 * ����û�
	 */
	public boolean addUser(Users user);
	
	/**
	 * ͨ���û������û�
	 */
	public Users getUserByName(String username);
	
	/**
	 * ��ѯ�û�
	 */
	public List<Users> queryUsers(int page, int count);
	
	/**
	 * ����û�������
	 */
	public Integer getUsersCount();
	
	/**
	 * �޸��û���Ϣ
	 */
	public boolean updateUser(Users user);
	
	/**
	 * ɾ���û�
	 */
	public boolean deleteUser(Integer id);
}
