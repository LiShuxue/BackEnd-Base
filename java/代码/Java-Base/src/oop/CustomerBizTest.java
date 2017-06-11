package oop;

import java.util.Scanner;

public class CustomerBizTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerBiz cu = new CustomerBiz();
		String flag = null;
		do {
			System.out.print("请输入客户姓名：");
			System.out.print("是否继续？");
			flag = input.next();
		}while("y".equals(flag));
		cu.showName();
		
	}
}
