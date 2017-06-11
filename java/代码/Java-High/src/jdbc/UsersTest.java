package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsersTest {

	public static void main(String[] args) {
		/**
		 * ²éÑ¯ËùÓÐuser
		 */
		UsersTest u = new UsersTest();
		List<Users> list = u.finduUsers();
		for(Users us : list) {
			System.out.println(us.getId() + "\t" + us.getUsername() + "\t" + us.getPassword());
		}
	}
	
	public List<Users> finduUsers() {
		Connection con = null;
		List<Users> userlist = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "231601");
			String sql = "select * from lsx.users";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			userlist = new ArrayList<>();
			while(rs.next()) {
				Users user = new Users(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
				userlist.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userlist;
	}
}
