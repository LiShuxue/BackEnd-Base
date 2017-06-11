package oop;

import java.util.Scanner;

public class PeopleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		People p1 = new People();
		while(true) {
			System.out.print("请输入姓名：");
			p1.name = input.next();
			if("n".equals(p1.name)){
				System.out.println("程序结束");
				break;
			}
			System.out.print("请输入年龄：");
			p1.age = input.nextInt();
			p1.info();
		
		}
	}
}
