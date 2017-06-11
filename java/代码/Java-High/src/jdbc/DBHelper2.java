package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * ���ݿ�����������
 *	���ã�
 *		1.������������������
 *		2.�ر�һ������
 */
public class DBHelper2 {
	
	//ͨ��java.util.Properties����ȡ�ⲿ�ļ�����������ͨ���޸��ⲿ�ļ��Ϳ��Ըı����ӵ����ݿ�����
	private static Properties prop = new Properties();
	/**
	 * 
	 * ͨ����ȡProperties�ļ��������������ݿ�����
	 * @return
	 */
	public static Connection getConnection(){
		Connection con = null;
		try {
			//ȥsrc�£� ��ø��ļ�������������
			InputStream in = DBHelper2.class.getClassLoader().getResourceAsStream("config.properties");
			//ΪProperties ָ����
			prop.load(in);
			
			Class.forName(prop.getProperty("DRIVER"));
			con = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PWD"));
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
