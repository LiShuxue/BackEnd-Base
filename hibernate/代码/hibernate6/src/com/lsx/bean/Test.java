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
		//����ѧ��
		Stu s = new Stu();
		s.setSname("lisi");
		//�����ɼ�
		Sc sc1 = new Sc(s, 90);
		Sc sc2 = new Sc(s, 50);
		Sc sc3 = new Sc(s, 80);
		//��óɼ����ϣ���ӳɼ�
		s.getScs().add(sc1);
		s.getScs().add(sc2);
		s.getScs().add(sc3);

		//û����Ӽ���ʱ��ֻ����ӽ�ȥѧ�����ɼ���������ӽ�ȥ
		//��Stu.hbm.6xml�м��ϼ������ܱ�֤��һ��ѧ��ͬʱ��3���ɼ�
		session.save(s);
		tran.commit();
		session.close();
		*/
		
		
		//���ԭ��û�гɼ���ѧ��
		Stu s2 = (Stu)session.get(Stu.class, 13);
		//�����ɼ�
		Sc sc1 = new Sc(s2, 66);
		Sc sc2 = new Sc(s2, 55);
		Sc sc3 = new Sc(s2, 88);
		//��óɼ����ϣ���ӳɼ�
		s2.getScs().add(sc1);
		s2.getScs().add(sc2);
		s2.getScs().add(sc3);
		
		session.save(s2);
		tran.commit();
		session.close();
	}	
}
