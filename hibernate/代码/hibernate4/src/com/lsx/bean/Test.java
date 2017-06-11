package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		//自由状态的对象
		U user = new U("xx", 20);
		
		session.save(user);  //自由-->持久
		System.out.println(user.getId());
		tran.commit();
		session.close();   //持久-->游离
		
		//游离和自由的区别？和数据库数据对应，和session没关联，游离
		System.out.println(user.getId());
		
		//再创建一个session，再去管理（update）上面的user，游离-->持久
		
		//当执行delete()，就会从持久（因为是从get/load得到的user）变为自由状态
	}
}
