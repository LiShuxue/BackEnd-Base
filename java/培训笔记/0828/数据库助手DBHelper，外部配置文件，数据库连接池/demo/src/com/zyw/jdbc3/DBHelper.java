package com.zyw.jdbc3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ���ݿ�����������
 *	���ã�
 *		1.Ϊ�Ҽ�����������������
 *		2.�ر�һ������
 */
public class DBHelper {
	//ͨ��java.util.Properties����ȡ�ⲿ�ļ�
	private static Properties prop = new Properties();
	/**
	 * 
	 * ͨ����ȡProperties�ļ��������������ݿ�����
	 * @return
	 */
	public static Connection getConnection(){
		Connection con = null;
		try {
			//����ȥsrc�£� ���ļ�������������
			InputStream in = DBHelper.class.getClassLoader().getResourceAsStream("config.properties");
			//ΪProperties ָ����
			prop.load(in);
			
			Class.forName(prop.getProperty("DRIVER"));
			con = DriverManager.getConnection(prop.getProperty("URL"), 
					prop.getProperty("USER"), prop.getProperty("PWD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * �ر�����
	 */
	public static void closeConnection(Connection con){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
