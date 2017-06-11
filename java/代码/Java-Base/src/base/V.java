package base;
import java.util.Scanner;


public class V {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum =0;
		int i = 0;
		System.out.print("输入学生姓名：");
		String name = input.next();
		for(; i<5; i++) {
			System.out.print("请输入第" + (i+1) + "门课的成绩：");
			double grade = input.nextDouble();
			if(grade<0) {
				System.out.println("抱歉，分数录入错误");
				break;
			}
			sum = sum + grade;
		}
		if(i>=5) {
			System.out.println("平均成绩：" + sum/i);
		}
		else if(i==0){
			System.out.println("第一门录入就有错，不能求平均");
		}
		else {
			System.out.println("录入有误，但录入正确的分数的平均成绩为："+ sum/i);
		}
		
	}
}
