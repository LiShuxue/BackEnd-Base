//��Ŀ����������������m��n���������Լ������С��������   
/**��ѭ���У�ֻҪ����������0���ýϴ������Խ�С��������С��һ������Ϊ��һ��ѭ���Ĵ�����ȡ�õ�������Ϊ��һ��ѭ���Ľ�С���������ѭ��ֱ����С������ֵΪ0�����ؽϴ������������Ϊ���Լ������С������Ϊ����֮���������Լ����**/

package ��Լ���͹�����;
import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
		int m,n,b,c;
		System.out.println("������һ��������m��");
		Scanner s1 = new Scanner(System.in);
		m = s1.nextInt();
		System.out.println("��������һ��������n��");
		n = s1.nextInt();
		
		GongYueShu G = new GongYueShu();
		b = G.GongYue(m, n);
		c = m * n / b;
		System.out.println(m + "��" + n + "�����Լ���ǣ�" + b);
		System.out.println(m + "��" + n + "����С�������ǣ�" + c);
		
		s1.close();

	}

}
class GongYueShu {
	GongYueShu() {
		
	}
	public int GongYue(int x, int y) {
		int a;
		if(x<y) {
			a=y;
			y=x;
			x=a;
		}
		while(y!=0) {
			if(x==y)
				return x;
			else {
				int k = x % y; 
				x=y;
				y=k;
			}
		}
		return x;		
	}
}
