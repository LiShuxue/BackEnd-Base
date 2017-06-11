package com.lsx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;

public class DBHelper {
	private static Properties prop = null;
	private static final int MAX_SIZE=20;          //���洢�ռ�
	private static Vector<Connection> pool = null; //�������洢���ӡ�vector֧��ͬ��
	
	/**
	 * ��������������ʼ��properties����
	 */
	static{
		prop = new Properties();
		try {
			prop.load(DBHelper.class.getClassLoader().getResourceAsStream("config.properties"));
			Class.forName(prop.getProperty("DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����һ�����ݿ������
	 */
	private static synchronized Connection createConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(prop.getProperty("URL"), 
					prop.getProperty("USER"), prop.getProperty("PWD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * ��ȡһ������
	 */
	public static synchronized Connection getConnection(){
		if (pool == null) {
			pool = new Vector<Connection>();//�����û��ֵ���ʹ���һ��
		}
		Connection con = null;
		if(pool.isEmpty()) {
			con = createConnection();//�������û��Ԫ�� ,�ʹ���һ���µ�����
		} else {
			con = pool.remove(pool.size()-1);//�ӳ��л�ȡһ������
		}
		return con;
		
	}
	
	/**
	 * �ر�����
	 */
	public static synchronized  void closeConnection(Connection con) {
		if(pool.size()  >MAX_SIZE){
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			pool.add(con);
		}
	}
}
