package com.zyw.jdbc3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库连接助手类
 *	作用：
 *		1.为我加载驱动，创建连接
 *		2.关闭一个连接
 */
public class DBHelper {
	//通过java.util.Properties来读取外部文件
	private static Properties prop = new Properties();
	/**
	 * 
	 * 通过读取Properties文件参数，创建数据库连接
	 * @return
	 */
	public static Connection getConnection(){
		Connection con = null;
		try {
			//来回去src下， 该文件的输入流对象
			InputStream in = DBHelper.class.getClassLoader().getResourceAsStream("config.properties");
			//为Properties 指定流
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
	 * 关闭连接
	 */
	public static void closeConnection(Connection con){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
