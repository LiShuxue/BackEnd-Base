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
		
		//没有建立级联的时候，只能单独添加person,另一个card添加不进去
		/*
		Person p = new Person();
		p.setPname("zhangsan");
		Card c = new Card();
		c.setCnum("1231231");
		p.setCard(c);
		c.setPerson(p);
		session.save(p);
		tran.commit();
		*/
		
		//单独填入card，提供一个person，该card取person的id为自己的id
		/*
		Card c = new Card();
		c.setCnum("123456");
		Person p = (Person)session.load(Person.class, 12);
		c.setPerson(p);
		session.save(c);
		tran.commit();
		*/
		
		//添加cascade="all"后，建立级联。相互set后，会一起添加到数据库
		/*
		Person p = new Person();
		Card c = new Card();
		
		p.setPname("xxx");
		c.setCnum("123123456");
		
		c.setPerson(p);
		p.setCard(c);
		session.save(p);
		tran.commit();
		*/
		
		
		//默认使用级联查询(查Person也能查出card)。
		/*
		Person p = (Person)session.get(Person.class, 11);
		System.out.println(p.getPname());
		System.out.println(p.getCard().getCnum());
		*/
		
		session.close();
	}
}
