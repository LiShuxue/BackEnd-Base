package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCLogin2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = input.next();
		System.out.print("请输入密码：");
		String password = input.next();
		
		JDBCLogin2 t2 = new JDBCLogin2();
		if(t2.login(username, password)) {
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

			/*
			 *  使用 PreparedStatement 接口，可以防止 sql注入 ，以及更加方便的传参
			 *  这个 ? 称为占位符，当前这个值还不能确定，我们可以后期向该sql中二次传值
			 */
			String sql = "select count(*) from lsx.users where username=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			//设置两个参数的值
			pstmt.setString(1, username);   //注意参数的类型
			pstmt.setString(2, password);
			
			//结果集中只有一列，值要不就是0，要不就是1
			ResultSet rs = pstmt.executeQuery(); //这个括号里面就不用再写sql了
		
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
