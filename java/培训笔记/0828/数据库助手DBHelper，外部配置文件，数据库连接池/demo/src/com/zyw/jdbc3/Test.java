package com.zyw.jdbc3;

import java.sql.Connection;

public class Test {
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		for(int i=0; i<10; i++){
			Connection con = DBHelper.getConnection();
			//System.out.println(con);
			DBHelper.closeConnection(con);
		}
		System.out.println(System.currentTimeMillis() - begin);
	}

}
