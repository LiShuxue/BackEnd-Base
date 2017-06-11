package jdbc;

import java.sql.Connection;

public class DBHelperTest {
	
	public static void main(String[] args) {
		//1.获得连接
		Connection con = DBHelper3.getConnection();
		System.out.println(con);
		//2.关闭连接
		DBHelper3.closeConnection(con);
	}

}
