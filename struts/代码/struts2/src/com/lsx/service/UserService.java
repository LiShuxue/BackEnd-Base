package com.lsx.service;

public class UserService implements IUserService {
	
	/**
	 * DAOʡ�ԡ�������
	 */
	@Override
	public boolean login(String username, String password) {
		
		if("haochen".equals(username) && "3838438".equals(password)) {
			return true;
		}	
		return false;	
	}
}
