package com.ysj.service;

import java.util.List;

import com.ysj.bean.Users;

public interface IUsersService {

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
	 * ��ѯĳ���û���Ϣ�������û���
	 */
	public Users queryUserByName(String username);
	
	/**
	 * ��ѯĳ���û���Ϣ�������û�ID
	 */
	public Users queryUserById(Integer userid);
	
	/**
	 * ��ѯĳ���û���Ϣ�������û���𣨽�ɫ��
	 */
	public List<Users> queryUsersByType(Integer usertype);
	
	/**
	 * ����û�������
	 */
	public Integer getUsersCount();
}
