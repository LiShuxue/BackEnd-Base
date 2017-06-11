package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		/*
		 *  Class.forName(className) �� className��������������һ�� ����.��������·����
		 *  �����㽫�������ص��ڴ棬��������ʱ���޷��õ��������ġ�
		 *  
		 *  ������뽫һ������ص��ڴ沢�Ҵ��������Ķ���Ļ�
		 *  ͨ��һ����·����������Demo���ص��ڴ�  �ڻ�ȡ���Ķ���
		 */
		try {
			//������쳣�����ṩ���ַ��������Ҳ��������
			//Class һ����� ����Ϣ  Ҳ���Խ���Demo���Class����
			Class c = Class.forName("com.zyw.jdbc.Demo");
			//newInstance() ���������Ķ���  ����Object
			Demo demo = (Demo)c.newInstance();
			//���ʶ�����Դ
			System.out.println(demo.num);
			//���ϴ����Ķ�����ͨ���ַ�����������
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Demo{
	public int num = 100;
}
