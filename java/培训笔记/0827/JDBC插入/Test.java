package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		/**
		 * ����student������в�������
		 */
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			//ͨ�����ݿ����Ӷ��󣬻�ȡһ��Statement����
			//ע�⣺����java.sql�����һ���ӿڣ�����ִ��  SQL���
			Statement stmt = con.createStatement();
			//����SQL���,��������������ݿ��У�Navicat��ִ�й�����д������
			String sql = "insert into STUDENT values(5,'test3',"
					+ "to_date('2015-1-1','yyyy-mm-dd'),'tj','email','133')";
			//executeUpdate����ֵ  ����ִ�е�   Ӱ������
			int count = stmt.executeUpdate(sql);
			if(count > 0){
				System.out.println("ִ�гɹ�");
			}else{
				System.out.println("ִ��ʧ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
