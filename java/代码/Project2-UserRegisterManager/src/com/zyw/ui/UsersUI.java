package com.zyw.ui;

import java.util.Scanner;

import com.zyw.bean.Users;
import com.zyw.service.IUsersService;
import com.zyw.service.impl.UsersService;

public class UsersUI {

	public void zhuCeDeJieMian(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名:");
		String username = input.next();
		System.out.print("请输入密码:");
		String password = input.next();
		System.out.print("请输入年龄:");
		int age = input.nextInt();
		//根据输入信息，创建一个Users对象
		Users user = new Users(0, username, password, age);
		//创建Service对象，调用注册方法
		IUsersService service = new UsersService();
		if(service.yongHuYaoZhuCe(user)){
			System.out.println("注册成功");
		}else{
			System.out.println("该用户已存在");
		}
	}
}
