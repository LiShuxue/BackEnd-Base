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
		//����״̬�Ķ���
		U user = new U("xx", 20);
		
		session.save(user);  //����-->�־�
		System.out.println(user.getId());
		tran.commit();
		session.close();   //�־�-->����
		
		//��������ɵ����𣿺����ݿ����ݶ�Ӧ����sessionû����������
		System.out.println(user.getId());
		
		//�ٴ���һ��session����ȥ����update�������user������-->�־�
		
		//��ִ��delete()���ͻ�ӳ־ã���Ϊ�Ǵ�get/load�õ���user����Ϊ����״̬
	}
}
