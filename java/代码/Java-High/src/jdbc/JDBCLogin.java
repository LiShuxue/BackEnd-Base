package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCLogin {

	public static void main(String[] args) {
		/**
		 * �û���½����֤����������Ƿ�����ݿ������һ��
		 * ���������ᵼ��sqlע�룬����ֻ�����û�������һ��'--   ���������Ҳ�ܵ�½
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String username = input.next();
		System.out.print("���������룺");
		String password = input.next();
		
		JDBCLogin t1 = new JDBCLogin();
		if(t1.login(username, password)) {
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("��½ʧ��");
		}
		
		input.close();
	}
	
	public boolean login(String username, String password) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "231601");
			Statement stmt = con.createStatement();
			//��ѯ���ݿ����û����������������û���������ͬ���У��м���
			String sql = "select count(*) from lsx.users where username='"+username+"' and password='"+password+"'";
			
			//�������ֻ��һ�У�ֵҪ������0��Ҫ������1
			ResultSet rs = stmt.executeQuery(sql);
		
			if(rs.next()){  //����������������
				
				if(rs.getInt(1)>0) { //�жϽ��������һ�У��������ֻ����һ�У��������Ƿ����0������0��ʾ���ݿ����и�������û���������ͬ����
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
