//��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���� 

package ����;
public class Rabbit {
	public static void main(String[] args) {
		System.out.println("��1���µ����Ӷ����ǣ�1");
		System.out.println("��2���µ����Ӷ����ǣ�1");
		
		//�Ժ��ÿ���¶���ǰ����������֮��
		int f1=1, f2=1, f, M=12;
		for(int i=3; i<=M; i++) {
			f=f2;
			f2=f1+f2;
			f1=f;
			System.out.println("��" + i + "���µ����Ӷ����ǣ�" + f2);
			
		}
	}
}