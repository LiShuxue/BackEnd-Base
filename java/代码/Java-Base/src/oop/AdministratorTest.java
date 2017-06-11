package oop;

import java.util.Scanner;

public class AdministratorTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Administrator a1 = new Administrator();
		// a1.username = "admin1";
		// a1.password = "111111";
		// a1.show();
		//
		// Administrator a2 = new Administrator();
		// a2.username = "admin2";
		// a2.password = "222222";
		// a2.show();

		while (true) {
			Administrator a3 = new Administrator();
			System.out.print("请输入用户名：");
			String username1 = input.next();
			System.out.print("请输入密码：");
			String password1 = input.next();
			
			if ("admin1".equals(username1) && "111111".equals(password1)) {	
				System.out.println("登陆成功");
				while (true) {
					System.out.println();
					System.out.print("请输入新密码：");
					String password3 = input.next();
					System.out.print("请再次输入新密码：");
					String password4 = input.next();
					if (password3.equals(password4)) {
						System.out.println("修改密码成功，您的新密码为：" + password3);
						break;
					} else {
						System.out.println("您两次输入的密码不一致，请重新输入");
					}
				}
				break;
			}
			else {
				System.out.println("用户名或密码输入错误，登陆失败");
				System.out.println();
			}
		}

	}
}
