package oop;

import java.util.Scanner;

public class PeopleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		People p1 = new People();
		while(true) {
			System.out.print("������������");
			p1.name = input.next();
			if("n".equals(p1.name)){
				System.out.println("�������");
				break;
			}
			System.out.print("���������䣺");
			p1.age = input.nextInt();
			p1.info();
		
		}
	}
}
