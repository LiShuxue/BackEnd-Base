package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *ͨ��hibernate�������ݿ��ɾ��
 */
public class Test4 {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//Ҳ��һ������
		Transaction tran = session.beginTransaction();
		//�Ȳ�ѯ����
		U user = (U)session.get(U.class, 1);
		//ִ��ɾ��(��Ҳ���������ύʱ��ִ��)
		session.delete(user);
		//�ύ����
		tran.commit();
		session.close();
	}
}
