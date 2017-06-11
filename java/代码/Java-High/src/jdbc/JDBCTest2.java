package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTest2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "231601");
			Statement stmt = con.createStatement();
			
			//通过变量来添加,每个值改为            "+变量+"
			String id = "s011";
			String name = "王五";
			int age = 20;
			String sex = "男";
			
			String sql = "insert into lsx.student values('"+id+"', '"+name+"', "+age+", '"+sex+"')";
			int count = stmt.executeUpdate(sql);
			System.out.println("添加成功，受影响的行数为：" + count);
			
			String sql2 = "delete from lsx.student where sno='s011'";
			int count2 = stmt.executeUpdate(sql2);
			System.out.println("删除成功，受影响的行数为:" + count2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
