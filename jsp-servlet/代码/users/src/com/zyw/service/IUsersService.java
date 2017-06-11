package com.zyw.service;

import java.util.List;

import com.zyw.bean.Users;

public interface IUsersService {
	/**
	 * ����û�
	 * @param user
	 */
	public boolean addUser(Users user);
	
	/**
	 * ��ѯ�û�
	 */
	public List<Users> queryUsers(int page,int count);
	
	/**
	 * ����û�������
	 */
	public Integer getUsersCount();
	
	/**
	 * �û���Ϣ����
	 */
	public boolean updateUser(Users user);
	
	/**
	 * ɾ���û�
	 */
	public boolean deleteUser(Integer id);
	
	/**
	 * ͨ���û������û�
	 * @param uname
	 * @return
	 */
	public Users getUserByName(String uname);
}
