package com.lsx.service;

import com.lsx.bean.Users;

public interface IUsersService {
	
	/**
	 * ��һ���û���ҵ�񷽷�
	 * 		�÷����п��ܻ���ö��dao�еķ�����
	 */
	public Users queryUser(Integer id);
}
