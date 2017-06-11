package base;
import java.util.Scanner;


public class W {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=0;
		int count1 = 0;
		int count2 = 0;
		for(i=0; i<10; i++) {
			System.out.print("请输入第" + (i+1) + "位顾客的年龄：");
			int age = input.nextInt();
			if(age>=30) {
				count1++;
			}
			else if(age<30){
				count2++;
			}
			else{
				System.out.println("年龄输入错误");
			}
			
		}
		System.out.println("30岁以下的比例是："  + (double)count2/i * 100 + "%");
		System.out.println("30岁以下的比例是："  + (double)count1/i * 100 + "%");
	}
}
