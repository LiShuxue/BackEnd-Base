package com.lsx.dao.impl;

import com.lsx.bean.Users;
import com.lsx.dao.IUsersDAO;

public class UsersDAO implements IUsersDAO {

	@Override
	public Users findUsersByID(Integer id) {
		// 调用DBHelper操作数据库，模拟，如果id是1将获取到一个用户
		// 省略数据库查询。。。。。
		if (id == 1) {
			Users user = new Users(1, "haochen", "3838438");
			return user;
		}
		// 没查到指定用户
		return null;
	}

}
