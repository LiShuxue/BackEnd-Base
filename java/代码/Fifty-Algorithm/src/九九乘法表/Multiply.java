package �žų˷���;
/*
 * ��Ŀ�����9*9�ھ���
 */

public class Multiply {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=i; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"   ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"   ");
			}
			System.out.println();
		}

	}

}
