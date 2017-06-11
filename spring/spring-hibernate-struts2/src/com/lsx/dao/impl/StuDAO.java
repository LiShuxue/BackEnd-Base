package com.lsx.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lsx.bean.Stu;
import com.lsx.dao.IStuDAO;

public class StuDAO extends HibernateDaoSupport implements IStuDAO {

	@Override
	public Stu findStuByName(String name) {
													//�����hql��䣬Ҫдʵ�������������Ǳ���
		List<Stu> list = getHibernateTemplate().find("from Stu where sname=?", name);
		return list.size()>0 ? list.get(0) : null;
		
		//��η������ݿ⣿����������ѡ��
		//getSession().createQuery("from Users");
		//getHibernateTemplate().find( "FROM Users);
	}

	@Override
	public void addStu(Stu stu) {
		//ֱ��ʹ��hibernate �������������spring����
		//getHibernateTemplate() �����������,��ʹ�������������������̳�HibernateDaoSsuppport
		
		getHibernateTemplate().save(stu);

	}

}
