package com.zyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 *  �û���¼��ͨ�����ݿ��е����ݺ���������ݣ�������֤
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String username = input.next();
		System.out.print("���������룺");
		String password = input.next();
		Test t = new Test();
		if(t.login(username, password)){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
		
	}
	
	public boolean login(String username,String password){
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			/*
			 *  ʹ�� PreparedStatement �ӿڣ����Է�ֹ sqlע�� ���Լ����ӷ���Ĵ���
			 *  ��� ? ��Ϊռλ������ǰ���ֵ������ȷ�������ǿ��Ժ������sql�ж��δ�ֵ
			 */
			String sql = "select count(*) from users where username=? and password=?";
			// 'zhangsan'--'
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, username);	//1 2 ����ڼ����ʺ�
			stmt.setString(2, password);	//Ҫ���ݵ����ͣ����ò�ͬ�ķ���
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				if(rs.getInt(1) > 0){
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		} finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
