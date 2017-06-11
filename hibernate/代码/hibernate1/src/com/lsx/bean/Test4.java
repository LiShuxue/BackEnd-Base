package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *通过hibernate进行数据库的删除
 */
public class Test4 {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//也是一个事务
		Transaction tran = session.beginTransaction();
		//先查询对象
		U user = (U)session.get(U.class, 1);
		//执行删除(但也是在事务提交时才执行)
		session.delete(user);
		//提交事务
		tran.commit();
		session.close();
	}
}
