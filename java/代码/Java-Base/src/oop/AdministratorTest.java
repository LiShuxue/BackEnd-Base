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
			System.out.print("�������û�����");
			String username1 = input.next();
			System.out.print("���������룺");
			String password1 = input.next();
			
			if ("admin1".equals(username1) && "111111".equals(password1)) {	
				System.out.println("��½�ɹ�");
				while (true) {
					System.out.println();
					System.out.print("�����������룺");
					String password3 = input.next();
					System.out.print("���ٴ����������룺");
					String password4 = input.next();
					if (password3.equals(password4)) {
						System.out.println("�޸�����ɹ�������������Ϊ��" + password3);
						break;
					} else {
						System.out.println("��������������벻һ�£�����������");
					}
				}
				break;
			}
			else {
				System.out.println("�û���������������󣬵�½ʧ��");
				System.out.println();
			}
		}

	}
}
