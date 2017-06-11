package com.lsx.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * ͨ��hibernate��ѯ���ݿ�
 */
public class Test1 {
	public static void main(String[] args) {
		// ����src�µ�Ĭ�ϵ� hibernate.cfg.xml ��������ļ�
		Configuration config = new Configuration().configure();
		// ��ȡһ��session����������������ݿ����ã�Ϊ�㽨�����ݿ����ӻỰ
		SessionFactory factory = config.buildSessionFactory();
		// ����һ���µĻỰ,���˻Ự����Ϳ���ֱ��ȥ�������ݿ���ˡ� �൱��getConnection()
		Session session = factory.openSession();
		// ��ѯ֮ǰ��������ݣ���Ҫ����������ѯ����id ��1��
		// get�� ����1�� ����һ������ ����2 �������Ǽ���
		U user = (U) session.get(U.class, 2);
		System.out.println("������" + user.getName());
		System.out.println("���䣺" + user.getAge());
		// �������֮����Ҫ�رջỰ����֮ǰjdbc���ر�����ͬ����
		session.close();
	}
}
