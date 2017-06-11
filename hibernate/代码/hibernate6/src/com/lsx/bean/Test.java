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
		/*
		//创建学生
		Stu s = new Stu();
		s.setSname("lisi");
		//创建成绩
		Sc sc1 = new Sc(s, 90);
		Sc sc2 = new Sc(s, 50);
		Sc sc3 = new Sc(s, 80);
		//获得成绩集合，添加成绩
		s.getScs().add(sc1);
		s.getScs().add(sc2);
		s.getScs().add(sc3);

		//没有添加级联时，只能添加进去学生，成绩表并不能添加进去
		//在Stu.hbm.6xml中加上级联才能保证加一个学生同时加3个成绩
		session.save(s);
		tran.commit();
		session.close();
		*/
		
		
		//获得原来没有成绩的学生
		Stu s2 = (Stu)session.get(Stu.class, 13);
		//创建成绩
		Sc sc1 = new Sc(s2, 66);
		Sc sc2 = new Sc(s2, 55);
		Sc sc3 = new Sc(s2, 88);
		//获得成绩集合，添加成绩
		s2.getScs().add(sc1);
		s2.getScs().add(sc2);
		s2.getScs().add(sc3);
		
		session.save(s2);
		tran.commit();
		session.close();
	}	
}
