package base;
import java.util.Scanner;
/**
 * ����һ����ݺ��·ݣ��ж�������ж�����
 */

public class M {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�����꣺");
		int year = input.nextInt();
		System.out.print("�����£�");
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
				System.out.println(year + "��" + month + "����31��");
				break;
			case 2:
				System.out.println(year + "��" + month + "����29��");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year + "��" + month + "����30��");
				break;
			default:
				System.out.println("��������");
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
				System.out.println(year + "��" + month + "����31��");
				break;
			case 2:
				System.out.println(year + "��" + month + "����29��");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year + "��" + month + "����30��");
				break;
			default:
				System.out.println("��������");
			}
		}
	}
}

