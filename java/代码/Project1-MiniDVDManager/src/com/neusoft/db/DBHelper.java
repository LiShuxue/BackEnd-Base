package com.neusoft.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;

/**
 * ���ݿ����ӳ�
 * 		���������ݿ�����ʱ�� ��������п������ӣ����ó�һ���������ӣ������Ϊ�գ�������һ���µ�����
 * 		���ر����ݿ�����ʱ����������пռ䣬�����ӷŻس��У� ��������ˣ� ��ֱ�ӹرյ�
 * 
 * ͨ���ز��������Ժܿ��ٵĻ�����Ӻ͹ر����ӣ����Ч��
 */
public class DBHelper {
	
	//ͨ��java.util.Properties����ȡ�ⲿ�ļ�����������ͨ���޸��ⲿ�ļ��Ϳ��Ըı����ӵ����ݿ�����
	private static Properties prop = null;
	//֧�ֵĿռ�
	private static final int MAX_SIZE = 20;
	//Vector���ϣ�֧��ͬ��
	private static Vector<Connection> pool = null;
	
	//���ݿ����������ʱ��ֻ��Ҫ����һ�ξͿ��ԣ�����ʹ�þ�̬��
	static{
		//��ʼ��Properties����
		prop = new Properties();
		try {
			prop.load(DBHelper.class.getClassLoader().getResourceAsStream("config.properties"));
			Class.forName(prop.getProperty("DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * ����һ�����ݿ�����
	 */
	private static synchronized Connection createcConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PWD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	} 
	
	/**
	 * ��ȡ������ݿ�����
	 */
	public static synchronized Connection getConnection(){
		//�����Ϊnull�����ػ�δ����ʼ�����ʹ��������
		if(pool == null) {
			pool = new Vector<>();
		}
		//�����Ϊ�գ�������û��Ԫ�أ��ʹ���һ���µ�����
		Connection con =null;
		if(pool.isEmpty()) {
			con = createcConnection();
		}else {
			//���������Ԫ�أ��ͽ��������һ���ó���
			con = pool.remove(pool.size()-1);
		}
		return con;
	}
	
	/**
	 * �ر�����
	 */
	public static synchronized void closeConnection(Connection con){
		//��������ˣ���ֱ�ӹر�����
		if(pool.size() >= MAX_SIZE) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			//�����û�������ͽ�������ӷŽ�������
			pool.add(con);
		}
	}
}
