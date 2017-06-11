package com.lsx.dao;

import com.lsx.bean.Users;

public interface IUsersDAO {

	public Users findUsersByID(Integer id);
}
