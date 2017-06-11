package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCLogin2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String username = input.next();
		System.out.print("���������룺");
		String password = input.next();
		
		JDBCLogin2 t2 = new JDBCLogin2();
		if(t2.login(username, password)) {
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

			/*
			 *  ʹ�� PreparedStatement �ӿڣ����Է�ֹ sqlע�� ���Լ����ӷ���Ĵ���
			 *  ��� ? ��Ϊռλ������ǰ���ֵ������ȷ�������ǿ��Ժ������sql�ж��δ�ֵ
			 */
			String sql = "select count(*) from lsx.users where username=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			//��������������ֵ
			pstmt.setString(1, username);   //ע�����������
			pstmt.setString(2, password);
			
			//�������ֻ��һ�У�ֵҪ������0��Ҫ������1
			ResultSet rs = pstmt.executeQuery(); //�����������Ͳ�����дsql��
		
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
