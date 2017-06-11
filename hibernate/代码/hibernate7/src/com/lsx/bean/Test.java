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
		//����һ��ѧ��
		Stu s1 = new Stu();
		s1.setSname("wangwu");
		//������Ŀ
		Cou c1 = new Cou();
		c1.setCname("C");
		
		//��ѧ�����һ����Ŀ���͸���Ŀ���һ��ѧ��
		s1.getCous().add(c1);
		c1.getStus().add(s1);
		
		//��ѧ���Ϳ�Ŀ�����档����Ҫ���ü��������Զ���ѡ�α���Ҳ����
		session.save(s1);
		session.save(c1);
		*/
		
		/*
		//��һ��ѧ��ָ���������п�Ŀ
		//����һ��ѧ��
		Stu s2 = new Stu();
		s2.setSname("zhaoliu");
		//��ȡ�������п�Ŀ
		Cou c1 = (Cou)session.get(Cou.class, 1);
		Cou c2 = (Cou)session.get(Cou.class, 2);
		//��ӵ����ѧ����
		s2.getCous().add(c1);
		s2.getCous().add(c2);
		//�������ѧ��
		session.save(s2);
		*/
		
		//java��Ŀ��ѧ������˭
		Cou c1 = (Cou)session.get(Cou.class, 1);
		for(Object o : c1.getStus()) {
			Stu s = (Stu)o;
			System.out.println(s.getSname());
		}
				
		tran.commit();
		session.close();
	}	
}
