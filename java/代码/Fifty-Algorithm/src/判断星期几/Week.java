package �ж����ڼ�;

import java.util.Scanner;

/*
 * ��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ����������жϵڶ�����ĸ�� 
 * һ��Monday
 * ����Tuesday
 * ����Wednesday
 * �ģ�Thursday
 * �壺Friday
 * ����Saturday
 * �գ�Sunday
 * 
 * M W F T T S S
 */
 
public class Week {
	public static void main(String[] args) {
		Week we = new Week();
		we.week();
	}
	
	public void week() {
		System.out.print("�������һ����ĸ��");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		if(a.equals("m") || a.equals("M")) {
			System.out.println("Monday ����һ");
		}
		else if(a.equals("w") || a.equals("W")) {
			System.out.println("Wednesday ������");
		}
		else if(a.equals("f") || a.equals("F")) {
			System.out.println("Friday ������");
		}
		else if(a.equals("t") || a.equals("T")) {
			System.out.print("������ڶ�����ĸ��");
			Scanner input2 = new Scanner(System.in);
			String b = input.nextLine();
			if(b.equals("u") || b.equals("U")) {
				System.out.println("Tuesday ���ڶ�");
			}
			else if(b.equals("h") || b.equals("H")) {
				System.out.println("Thursday ������");
			}
			else {
				System.out.print("������������������...");
				System.out.println();
				week();
			}
		}
		else if(a.equals("s") || a.equals("S")) {
			System.out.print("������ڶ�����ĸ��");
			Scanner input3 = new Scanner(System.in);
			String c = input.nextLine();
			if(c.equals("a") || c.equals("A")) {
				System.out.println("Saturday ������");
			}
			else if(c.equals("u") || c.equals("U")) {
				System.out.println("Sunday ������");
			}
			else {
				System.out.print("������������������...");
				System.out.println();
				week();
			}
		}
		else {
			System.out.print("������������������...");
			System.out.println();
			week();
		}
	}
}
