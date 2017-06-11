package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 数据库连接助手类
 *	作用：
 *		1.加载驱动，创建连接
 *		2.关闭一个连接
 */
public class DBHelper2 {
	
	//通过java.util.Properties来读取外部文件，这样可以通过修改外部文件就可以改变连接的数据库类型
	private static Properties prop = new Properties();
	/**
	 * 
	 * 通过读取Properties文件参数，创建数据库连接
	 * @return
	 */
	public static Connection getConnection(){
		Connection con = null;
		try {
			//去src下， 获得该文件的输入流对象
			InputStream in = DBHelper2.class.getClassLoader().getResourceAsStream("config.properties");
			//为Properties 指定流
			prop.load(in);
			
			Class.forName(prop.getProperty("DRIVER"));
			con = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PWD"));
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
