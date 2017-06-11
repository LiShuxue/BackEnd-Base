package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
	/**
	 * 1.�����ݿ�����jar��������Ŀ����Ŀ���½�lib�ļ��У���jar�����ƽ�����Ȼ���Ҽ�build path 2.�����о������
	 * 1.�������ݿ���������jar�еĳ�����ص��ڴ棩
	 * 2.��ȡ���ݿ�����ӣ�ͨ��java.sql.Connection�ӿڣ��������ӾͿ��Բ������ݿ��ˣ� 3.�������ݿ� 4.�ر����ݿ������
	 */

	public static void main(String[] args) {
		Connection con = null;
		try {
			// 1����������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2���������ݿ�
			// �½�Connection����
			// url ���ݿ������ַ���
			// user ���ݿ��û���
			// password ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system", "231601");
			System.out.println("���������ݿ�");
			// 3���������ݿ��е�����
			// ͨ��Connection�������createStatement()����������һ�� Statement��������
			// SQL��䷢�͵����ݿ�
			Statement stmt = con.createStatement();
			// ����һ��sql��䣬���������ݿ⣬��������Ҫ�����ݿ��в��Թ�û����ע�⣬sql��䲻Ҫ���ֺ�
			String sql = "insert into lsx.student values ('s011', '����', 20, '��')";
			// ͨ�� Statement�������executeUpdate(sql)������ִ�и�����sql��䣬����һ��int����������Ӱ�������
			int count = stmt.executeUpdate(sql);
			System.out.println("��ӳɹ�����Ӱ�������Ϊ:" + count);

			String sql2 = "delete from lsx.student where sno='s011'";
			int count2 = stmt.executeUpdate(sql2);
			System.out.println("ɾ���ɹ�����Ӱ�������Ϊ:" + count2);

			String sql3 = "update lsx.student set sage=24 where sno='s013'";
			int count3 = stmt.executeUpdate(sql3);
			System.out.println("�޸ĳɹ�����Ӱ�������Ϊ:" + count3);

			String sql4 = "select * from lsx.student";
			ResultSet rs = stmt.executeQuery(sql4);
			int col = rs.getMetaData().getColumnCount();
			System.out.println("��ѯ�ɹ�");
			System.out.println("----------------------------");
			while (rs.next()) {
				for (int i = 1; i <= col; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			System.out.println("----------------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			// 4.�ر����ݿ�����
			try {
				con.close();
				System.out.println("�ѹر����ݿ�");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
