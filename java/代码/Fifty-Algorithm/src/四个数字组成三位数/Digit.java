package �ĸ����������λ��;

/*
 * ��Ŀ����1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ��? ���Ƕ���?   
 */

public class Digit {
	int count=0;
	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<5; i++) {
			for (int j=1;j<5; j++) {
				for (int k=1; k<5; k++) {
					if(i!=j && j!=k && i!=k ) {
						System.out.println(i*100+j*10+k);
						count++;
					}
				}
			}
		}
		System.out.println("һ����" + count + "����");		
	}
}
