package base;
import java.util.Scanner;


public class V {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum =0;
		int i = 0;
		System.out.print("����ѧ��������");
		String name = input.next();
		for(; i<5; i++) {
			System.out.print("�������" + (i+1) + "�ſεĳɼ���");
			double grade = input.nextDouble();
			if(grade<0) {
				System.out.println("��Ǹ������¼�����");
				break;
			}
			sum = sum + grade;
		}
		if(i>=5) {
			System.out.println("ƽ���ɼ���" + sum/i);
		}
		else if(i==0){
			System.out.println("��һ��¼����д�������ƽ��");
		}
		else {
			System.out.println("¼�����󣬵�¼����ȷ�ķ�����ƽ���ɼ�Ϊ��"+ sum/i);
		}
		
	}
}
