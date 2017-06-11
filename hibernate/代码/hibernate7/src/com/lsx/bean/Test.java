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
		//创建一个学生
		Stu s1 = new Stu();
		s1.setSname("wangwu");
		//创建科目
		Cou c1 = new Cou();
		c1.setCname("C");
		
		//给学生添加一个科目，和给科目添加一个学生
		s1.getCous().add(c1);
		c1.getStus().add(s1);
		
		//把学生和科目都保存。不需要设置级联，会自动在选课表中也保存
		session.save(s1);
		session.save(c1);
		*/
		
		/*
		//给一个学生指定两个现有科目
		//创建一个学生
		Stu s2 = new Stu();
		s2.setSname("zhaoliu");
		//获取两个现有科目
		Cou c1 = (Cou)session.get(Cou.class, 1);
		Cou c2 = (Cou)session.get(Cou.class, 2);
		//添加到这个学生里
		s2.getCous().add(c1);
		s2.getCous().add(c2);
		//保存这个学生
		session.save(s2);
		*/
		
		//java科目的学生都有谁
		Cou c1 = (Cou)session.get(Cou.class, 1);
		for(Object o : c1.getStus()) {
			Stu s = (Stu)o;
			System.out.println(s.getSname());
		}
				
		tran.commit();
		session.close();
	}	
}
