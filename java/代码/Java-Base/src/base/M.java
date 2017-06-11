package base;
import java.util.Scanner;
/**
 * 输入一个年份和月份，判断这个月有多少天
 */

public class M {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("输入年：");
		int year = input.nextInt();
		System.out.print("输入月：");
		int month = input.nextInt();
		
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year + "年" + month + "月有31天");
				break;
			case 2:
				System.out.println(year + "年" + month + "月有29天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year + "年" + month + "月有30天");
				break;
			default:
				System.out.println("输入有误");
			}
		}
		else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year + "年" + month + "月有31天");
				break;
			case 2:
				System.out.println(year + "年" + month + "月有29天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year + "年" + month + "月有30天");
				break;
			default:
				System.out.println("输入有误");
			}
		}
	}
}

