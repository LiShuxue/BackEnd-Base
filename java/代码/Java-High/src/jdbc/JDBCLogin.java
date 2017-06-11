package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCLogin {

	public static void main(String[] args) {
		/**
		 * 用户登陆，验证输入的数据是否跟数据库的数据一致
		 * 但是这样会导致sql注入，就是只输入用户名，加一个'--   ，密码输错，也能登陆
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = input.next();
		System.out.print("请输入密码：");
		String password = input.next();
		
		JDBCLogin t1 = new JDBCLogin();
		if(t1.login(username, password)) {
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}
		
		input.close();
	}
	
	public boolean login(String username, String password) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "231601");
			Statement stmt = con.createStatement();
			//查询数据库中用户名，密码跟输入的用户名密码相同的行，有几行
			String sql = "select count(*) from lsx.users where username='"+username+"' and password='"+password+"'";
			
			//结果集中只有一列，值要不就是0，要不就是1
			ResultSet rs = stmt.executeQuery(sql);
		
			if(rs.next()){  //如果结果集中有数据
				
				if(rs.getInt(1)>0) { //判断结果集中这一列（结果集中只有这一列）的数据是否大于0，大于0表示数据库中有跟输入的用户名密码相同的行
					return true;
				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}	
}
