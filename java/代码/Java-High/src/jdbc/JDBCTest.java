package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
	/**
	 * 1.将数据库驱动jar包导入项目。项目中新建lib文件夹，将jar包复制进来，然后右键build path 2.代码中具体操作
	 * 1.加载数据库驱动（将jar中的程序加载到内存）
	 * 2.获取数据库的连接（通过java.sql.Connection接口，有了连接就可以操作数据库了） 3.操作数据库 4.关闭数据库的连接
	 */

	public static void main(String[] args) {
		Connection con = null;
		try {
			// 1、加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2、连接数据库
			// 新建Connection对象
			// url 数据库连接字符串
			// user 数据库用户名
			// password 密码
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system", "231601");
			System.out.println("已连接数据库");
			// 3、操作数据库中的数据
			// 通过Connection对象调用createStatement()方法来创建一个 Statement对象来将
			// SQL语句发送到数据库
			Statement stmt = con.createStatement();
			// 定义一个sql语句，来操作数据库，这个语句需要在数据库中测试过没错误，注意，sql语句不要带分号
			String sql = "insert into lsx.student values ('s011', '王五', 20, '男')";
			// 通过 Statement对象调用executeUpdate(sql)方法，执行给定的sql语句，返回一个int数，就是受影响的行数
			int count = stmt.executeUpdate(sql);
			System.out.println("添加成功，受影响的行数为:" + count);

			String sql2 = "delete from lsx.student where sno='s011'";
			int count2 = stmt.executeUpdate(sql2);
			System.out.println("删除成功，受影响的行数为:" + count2);

			String sql3 = "update lsx.student set sage=24 where sno='s013'";
			int count3 = stmt.executeUpdate(sql3);
			System.out.println("修改成功，受影响的行数为:" + count3);

			String sql4 = "select * from lsx.student";
			ResultSet rs = stmt.executeQuery(sql4);
			int col = rs.getMetaData().getColumnCount();
			System.out.println("查询成功");
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
			// 4.关闭数据库连接
			try {
				con.close();
				System.out.println("已关闭数据库");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
