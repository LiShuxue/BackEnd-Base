package jdbc;

import java.sql.Connection;

public class DBHelperTest {
	
	public static void main(String[] args) {
		//1.�������
		Connection con = DBHelper3.getConnection();
		System.out.println(con);
		//2.�ر�����
		DBHelper3.closeConnection(con);
	}

}
