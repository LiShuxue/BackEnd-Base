package com.zyw.ui;

import java.util.Scanner;

import com.zyw.bean.Users;
import com.zyw.service.IUsersService;
import com.zyw.service.impl.UsersService;

public class UsersUI {

	public void zhuCeDeJieMian(){
		Scanner input = new Scanner(System.in);
		System.out.print("�������û���:");
		String username = input.next();
		System.out.print("����������:");
		String password = input.next();
		System.out.print("����������:");
		int age = input.nextInt();
		//����������Ϣ������һ��Users����
		Users user = new Users(0, username, password, age);
		//����Service���󣬵���ע�᷽��
		IUsersService service = new UsersService();
		if(service.yongHuYaoZhuCe(user)){
			System.out.println("ע��ɹ�");
		}else{
			System.out.println("���û��Ѵ���");
		}
	}
}
