package com.ysj.dao;

import java.util.List;

import com.ysj.bean.Users;

public interface IUsersDAO {
	
	/**
	 * �����û�
	 */
	public boolean addUser(Users user);
	
	/**
	 * ɾ���û��������û���ID���
	 */
	public boolean deleteUser(Integer userid);
	
	/**
	 * �޸��û�
	 */
	public boolean updateUser(Users user);
	
	/**
	 * ��ѯ�����û���Ϣ
	 */
	public List<Users> queryAllUsers(int page, int count);
	
	/**
	 * ��ѯĳ���û���Ϣ�������û��������룬���û���𣨽�ɫ��
	 */
	public boolean queryUser(String username, String password, Integer usertype);
	
	/**
	 * ����û�������
	 */
	public Integer getUsersCount();
}		
