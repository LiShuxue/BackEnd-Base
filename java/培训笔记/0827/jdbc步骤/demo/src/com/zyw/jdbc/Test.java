package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		/*
		 * ʲô��JDBC��
		 * ͨ��Java�����������ݿ�ļ�����ʹ��������ǰѧϰ��sql��估Java���ԡ�
		 * ����ͨ��Java����ֱ��ȥ�������ݿ���ı�����ݡ�
		 * 
		 * 1.��ojdbc14.jar����ӵ���Ŀ�У�û�����ݿ��jar����ͬ��
		 * 2.����������¼�����
		 * 		1.�������ݿ���������jar���еĳ�����ص��ڴ棬��java���Ժ����ݿ�ͨ�ţ�
		 * 		2.��ȡ���ݿ������	��ͨ��java.sql.Connection�ӿڣ��������ӾͿ��Բ����ˣ�
		 * 		3.�������ݿ��е�����	
		 * 		4.�ر����ݿ������	
		 */
		
		
		try {
			//1.�������ݿ�����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.��ȡ���ݿ������
				/*	url  ���ݿ������ַ���
				 *  user ���ݿ���û���
				 *  password ���ݿ�����
				 */
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			System.out.println("���������ݿ�");
			//3.�������ݿ��е�����	ʡ�ԡ���
			//4.�ر����ݿ������	
			con.close();
			System.out.println("�ѹر����ݿ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
