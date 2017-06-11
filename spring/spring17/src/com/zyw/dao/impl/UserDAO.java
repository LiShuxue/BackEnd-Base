package com.zyw.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zyw.bean.Demo1User;
import com.zyw.dao.IUserDAO;

public class UserDAO extends HibernateDaoSupport implements IUserDAO{

	@Override
	public void insert(Demo1User user) {
	
		this.getHibernateTemplate().save(user);

	}
	
	
	/**
	 * ´íÎó·½·¨£¬ÑÝÊ¾
	 */
	@Override
	public void update() {
		this.getHibernateTemplate().bulkUpdate("update demo1user set id=1");
	}



	@Override
	public Demo1User find(Integer id) {
		return (Demo1User)this.getHibernateTemplate().get(Demo1User.class, id);
	}
}
