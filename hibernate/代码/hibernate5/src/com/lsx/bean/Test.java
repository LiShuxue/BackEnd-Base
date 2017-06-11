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
		
		//û�н���������ʱ��ֻ�ܵ������person,��һ��card��Ӳ���ȥ
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
		
		//��������card���ṩһ��person����cardȡperson��idΪ�Լ���id
		/*
		Card c = new Card();
		c.setCnum("123456");
		Person p = (Person)session.load(Person.class, 12);
		c.setPerson(p);
		session.save(c);
		tran.commit();
		*/
		
		//���cascade="all"�󣬽����������໥set�󣬻�һ����ӵ����ݿ�
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
		
		
		//Ĭ��ʹ�ü�����ѯ(��PersonҲ�ܲ��card)��
		/*
		Person p = (Person)session.get(Person.class, 11);
		System.out.println(p.getPname());
		System.out.println(p.getCard().getCnum());
		*/
		
		session.close();
	}
}
