package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *ͨ��hibernate�������ݿ���޸�
 */
public class Test3 {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//Ҳ��һ������
		Transaction tran = session.beginTransaction();
		//�Ȳ�ѯ����
		U user = (U)session.get(U.class, 1);
		//������������ֵ
		user.setName("lisisi");
		//ִ���޸�(��Ҳ���������ύʱ��ִ��)
		session.update(user);
		//�ύ����
		tran.commit();
		session.close();				
	}
}
