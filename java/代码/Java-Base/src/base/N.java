package base;
import java.util.Scanner;


public class N {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ�");
		double cost = input.nextInt();
		
		System.out.print("�Ƿ�μ��Żݻ����(y/n)��");
		String isChoice = input.next();
		if(isChoice.equals("y")) {
			if(cost>=50) {
				System.out.println("1����50Ԫ����2Ԫ�������¿�������һƿ");
				System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
				System.out.println("3����100Ԫ����10Ԫ����5�������");
				System.out.println("4����200Ԫ����10Ԫ����һ���ղ������˹�");
				System.out.println("5����200Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ");
				System.out.println("0��������");
				System.out.print("��ѡ��");
				int choice = input.nextInt();
				
				switch(choice){
				case 1:
					System.out.println("�������ѽ�" + (cost+2));
					System.out.println("�ɹ����������¿�������һƿ");
					break;
				case 2:
					System.out.println("�������ѽ�" + (cost+3));
					System.out.println("�ɹ�������500ml����һƿ");
					break;
				case 3:
					System.out.println("�������ѽ�" + (cost+10));
					System.out.println("�ɹ�������5�������");
					break;
				case 4:
					System.out.println("�������ѽ�" + (cost+10));
					System.out.println("�ɹ�������һ���ղ�������");
					break;
				case 5:
					System.out.println("�������ѽ�" + (cost+20));
					System.out.println("�ɹ�������ŷ����ˬ��ˮһƿ");
					break;
				case 0:
					System.out.println("��δѡ�񻻹�");
				}
			}
			else {
				System.out.println("�������Ѳ����㻻���������ټ���");
			}
		}
		else {
			System.out.println("��л����ʹ�á�");
		}
		
	}
}
