package com.zyw.dao;

import java.util.List;

import com.zyw.bean.Users;

public interface IUsersDAO {

	/**
	 * ����û�
	 * @param user
	 */
	public void add(Users user);
	
	/**
	 * ͨ���û������û�
	 * @param uname
	 * @return
	 */
	public Users getUserByName(String uname);
	
	/**
	 * ��ѯ�û�
	 * @param page ��ǰҳ��
	 * @param count  ��ʾ����
	 * @return
	 */
	public List<Users> queryUsers(int page,int count);
	
	/**
	 * ��ȡ�û�������
	 */
	public Integer getUsersCount();
	
	/**
	 * �޸��û���Ϣ
	 */
	public void updateUser(Users user);
	
	/**
	 * ɾ���û�
	 */
	public void deleteUser(Integer id);
}




