package com.zyw.jdbc2;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) {
		//1.�������
		Connection con = DBHelper.getConnection();
		System.out.println(con);
		//2.�ر�����
		DBHelper.closeConnection(con);
	}

}
