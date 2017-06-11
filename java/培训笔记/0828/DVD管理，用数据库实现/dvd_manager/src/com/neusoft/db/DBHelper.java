package com.neusoft.db;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

/**
 * ���ݿ����ӳ�
 * 		���������ݿ�����ʱ����������п������ӣ����ó�һ���ֳɵ����ӣ�������ǿյģ�������һ��������
 *		���ر����ݿ�����ʱ����������пռ䣬�����ӷŻس��У���������ˣ���ֱ�ӹرյ���
 */
public class DBHelper {

	private static Properties prop = null;
	private static final int MAX_SIZE = 20;		//֧�ֵĿռ�
	//Vector ���ϣ�֧��ͬ����
	private static Vector<Connection> pool = null;		//�������洢���ݿ������

	/**
	 * �������� ����ʼ��Properties����
	 */
	static{
		prop = new Properties();
		try {
			prop.load(DBHelper.class.getClassLoader().getResourceAsStream("config.properties"));
			//���ݿ�����ֻ��Ҫ����1��
			Class.forName(prop.getProperty("DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����һ���µ����ݿ�����
	 */
	private static synchronized Connection createConnection(){
		Connection con = null;
		try {
			con = DriverManager.getConnection(prop.getProperty("URL"), 
					prop.getProperty("USER"), prop.getProperty("PWD"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 *  ��ȡһ������
	 */
	public synchronized static Connection getConnection(){
		//�����û��ֵ���ʹ���һ��
		if(pool == null){
			pool = new Vector<>();
		}
		//�������û��Ԫ�� ,�ʹ���һ���µ�����
		Connection con = null;
		if(pool.isEmpty()){
			con = createConnection();
		}else{
			//�ӳ��л�ȡһ������
			con = pool.remove(pool.size()-1);
		}
		return con;
	}
	
	
	public synchronized static void closeConnection(Connection con){
		if(pool.size() >= MAX_SIZE){	//������,ֱ�ӹر�����
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			pool.add(con);
		}
	}
}


















