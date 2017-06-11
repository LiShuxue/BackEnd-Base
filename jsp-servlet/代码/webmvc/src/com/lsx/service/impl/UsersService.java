package com.lsx.service.impl;

import com.lsx.bean.Users;
import com.lsx.dao.IUsersDAO;
import com.lsx.dao.impl.UsersDAO;
import com.lsx.service.IUsersService;

public class UsersService implements IUsersService {

	//service�У���Ҫ�����ڵ���dao�ķ�������ɹ���
	//���ԣ�����Ҫ����һ��UsersDAO��ʵ�壬�������û������й���
	private IUsersDAO userDao = new UsersDAO();
	
	@Override
	public Users queryUser(Integer id) {
		//��Ϊ������ܱȽϼ�࣬����ֻ������dao��һ������
		return userDao.findUsersByID(id);
	}

}
