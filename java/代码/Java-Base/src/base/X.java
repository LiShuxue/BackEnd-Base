package base;
import java.util.Scanner;


public class X {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("�������Ա�ţ�<4λ����>����");
			String num = input.next();

			System.out.print("�������Ա���գ���/��<����λ������ʾ>����");
			String birth = input.next();
			
			System.out.print("�������Ա���֣�");
			int score = input.nextInt();
			if(num.length()==4) {
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println(num + "\t" + birth + "\t" + score);
				System.out.println();
				continue;
			}
			else {
				System.out.println("�ͻ���" + num + "����Ч��Ա���룡" );
				System.out.println("¼����Ϣʧ��");
				System.out.println();
			}
			
		}
		System.out.println("�������");
	}
}
