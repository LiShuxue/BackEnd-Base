package com.lsx.service.impl;

import com.lsx.bean.Users;
import com.lsx.dao.IUsersDAO;
import com.lsx.dao.impl.UsersDAO;
import com.lsx.service.IUsersService;

public class UsersService implements IUsersService {

	//service中，主要依赖于调用dao的方法来完成功能
	//所以，必须要创建一个UsersDAO的实体，来处理用户的所有功能
	private IUsersDAO userDao = new UsersDAO();
	
	@Override
	public Users queryUser(Integer id) {
		//因为这个功能比较简洁，所以只调用了dao的一个方法
		return userDao.findUsersByID(id);
	}

}
