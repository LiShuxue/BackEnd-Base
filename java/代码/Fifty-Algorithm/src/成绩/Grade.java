//题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 

package 成绩;

import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入学生的成绩(0-100)：");
		int n = s.nextInt();
		char grade = n>= 90 ? 'A' : n>= 60 ? 'B' : 'C';     //条件运算符！！！
		System.out.print("学生等级：" + grade);
//		if(n>=90) {
//			System.out.print("学生等级：");
//			System.out.println("A");
//		}
//			
//		else if(60<=n && n<=89) {
//			System.out.print("学生等级：");
//			System.out.println("B");
//		}
//			
//		else {
//			System.out.print("学生等级：");
//			System.out.println("C");
//		}
		
					
	}

}
