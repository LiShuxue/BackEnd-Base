package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * ͨ��hibernate�������ݿ⣬��ɾ��
 */
public class Test2 {
	public static void main(String[] args) {
		// ���������ļ�
		Configuration config = new Configuration().configure();
		// ���session����,���˹������ܻ�ȡsession�Ự
		SessionFactory factory = config.buildSessionFactory();
		// ���һ��session�Ự
		Session session = factory.openSession();
		
		// �������ݿ�
		// ����ɾ�ģ�����ʹ��������֮ǰ��������������Ҫ �ύ/�ع�
		// ��������
		Transaction tran = session.beginTransaction();
		// ����һ���û�
		U user = new U();
		user.setName("zhangsan");
		user.setAge(20);
		// ִ����ӣ���save����
		session.save(user);
		// �ύ����
		tran.commit();
		session.close();
		// ִ�б���û�����У���������Ҫ�޸�U.hbm.xml
		// ʵ���xml���� ������Integer

	}
}
