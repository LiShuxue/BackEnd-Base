package com.lsx.dao.impl;

import com.lsx.bean.Users;
import com.lsx.dao.IUsersDAO;

public class UsersDAO implements IUsersDAO {

	@Override
	public Users findUsersByID(Integer id) {
		// ����DBHelper�������ݿ⣬ģ�⣬���id��1����ȡ��һ���û�
		// ʡ�����ݿ��ѯ����������
		if (id == 1) {
			Users user = new Users(1, "haochen", "3838438");
			return user;
		}
		// û�鵽ָ���û�
		return null;
	}

}
