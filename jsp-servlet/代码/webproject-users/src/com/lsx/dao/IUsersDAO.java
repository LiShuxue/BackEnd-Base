package com.lsx.dao;


import java.util.List;

import com.lsx.bean.Users;

public interface IUsersDAO {
	/**
	 * ����û�
	 */
	public void addUser(Users user);
	
	/**
	 * �����û��������û�
	 */
	public Users getUserByName(String username);
	
	/**
	 * ��ѯ�û������е��û�.
	 * ��ǰҳ��page
	 * ��ʾ����count
	 */
	public List<Users> queryUsers(int page, int count);
	
	/**
	 * ��ȡ�û�������
	 */
	public Integer getUsersCount();
	
	/**
	 * �޸��û�
	 */
	public void updateUser(Users user);
	
	/**
	 * ɾ���û�
	 */
	public void deleteUser(Integer id);
}
