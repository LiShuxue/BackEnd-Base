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
			
			//ͨ�����������,ÿ��ֵ��Ϊ            "+����+"
			String id = "s011";
			String name = "����";
			int age = 20;
			String sex = "��";
			
			String sql = "insert into lsx.student values('"+id+"', '"+name+"', "+age+", '"+sex+"')";
			int count = stmt.executeUpdate(sql);
			System.out.println("��ӳɹ�����Ӱ�������Ϊ��" + count);
			
			String sql2 = "delete from lsx.student where sno='s011'";
			int count2 = stmt.executeUpdate(sql2);
			System.out.println("ɾ���ɹ�����Ӱ�������Ϊ:" + count2);
			
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
