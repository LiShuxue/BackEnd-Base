package base;
import java.util.Scanner;


public class W {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=0;
		int count1 = 0;
		int count2 = 0;
		for(i=0; i<10; i++) {
			System.out.print("�������" + (i+1) + "λ�˿͵����䣺");
			int age = input.nextInt();
			if(age>=30) {
				count1++;
			}
			else if(age<30){
				count2++;
			}
			else{
				System.out.println("�����������");
			}
			
		}
		System.out.println("30�����µı����ǣ�"  + (double)count2/i * 100 + "%");
		System.out.println("30�����µı����ǣ�"  + (double)count1/i * 100 + "%");
	}
}
