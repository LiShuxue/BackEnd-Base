package 判断星期几;

import java.util.Scanner;

/*
 * 题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。 
 * 一：Monday
 * 二：Tuesday
 * 三：Wednesday
 * 四：Thursday
 * 五：Friday
 * 六：Saturday
 * 日：Sunday
 * 
 * M W F T T S S
 */
 
public class Week {
	public static void main(String[] args) {
		Week we = new Week();
		we.week();
	}
	
	public void week() {
		System.out.print("请输入第一个字母：");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		if(a.equals("m") || a.equals("M")) {
			System.out.println("Monday 星期一");
		}
		else if(a.equals("w") || a.equals("W")) {
			System.out.println("Wednesday 星期三");
		}
		else if(a.equals("f") || a.equals("F")) {
			System.out.println("Friday 星期五");
		}
		else if(a.equals("t") || a.equals("T")) {
			System.out.print("请输入第二个字母：");
			Scanner input2 = new Scanner(System.in);
			String b = input.nextLine();
			if(b.equals("u") || b.equals("U")) {
				System.out.println("Tuesday 星期二");
			}
			else if(b.equals("h") || b.equals("H")) {
				System.out.println("Thursday 星期四");
			}
			else {
				System.out.print("输入有误，请重新输入...");
				System.out.println();
				week();
			}
		}
		else if(a.equals("s") || a.equals("S")) {
			System.out.print("请输入第二个字母：");
			Scanner input3 = new Scanner(System.in);
			String c = input.nextLine();
			if(c.equals("a") || c.equals("A")) {
				System.out.println("Saturday 星期六");
			}
			else if(c.equals("u") || c.equals("U")) {
				System.out.println("Sunday 星期日");
			}
			else {
				System.out.print("输入有误，请重新输入...");
				System.out.println();
				week();
			}
		}
		else {
			System.out.print("输入有误，请重新输入...");
			System.out.println();
			week();
		}
	}
}
