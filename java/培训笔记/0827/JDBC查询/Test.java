package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		/**
		 *  ��temp1���ѯ id  name
		 */
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			Statement stmt = con.createStatement();
			//��ѯ��sql���
			String sql = "select * from T_TEMP1";
			//ͨ��Statement��ִ�в�ѯ��䣬����executeQuery(),�᷵��һ�� "�����"
			//ͨ��java.sql.ResultSet�ӿڣ�����ȡ�����
			ResultSet rs = stmt.executeQuery(sql);
			//����������ˣ���֪�������ж�����������
			/*
			 * ��ȡ������е�����
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnName(2));
			*/
			//ֻ��һ�����ݣ����� true  false
			/*System.out.println(rs.next());
			System.out.println(rs.next());*/
			
			while(rs.next()){
				//�α�ÿ�����ƶ�һ�Σ��������ѭ�����ҽ�����ȥ�����һ���ϵ�����
				//��ôȥ������
				//�����ݵķ�ʽ1 ͨ���е�������������  ������1��ʼ
							//�㻹Ҫ֪����Ҫ����������� ��ʲô���͵�
				//System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
				//�����ݵķ�ʽ2 ͨ���ֶ�������ȡ����
				System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
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
