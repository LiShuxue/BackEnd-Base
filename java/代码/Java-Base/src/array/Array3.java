package array;

public class Array3 {
	public static void main(String[] args) {
		int[][] a = new int[7][8];
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		int[][]  myArr = { {1},{1,2},{1,2,3,},{1,2,3,4},{1,2,3,4,5} };
		for(int[]e1 : myArr) {        //����for eachѭ�������ѭ���õ�һ������
			for(int e2 : e1) {        //��������������for eachѭ�����õ����������ֵ
				System.out.print(e2);
			}
			System.out.println();
		}
	}
}
