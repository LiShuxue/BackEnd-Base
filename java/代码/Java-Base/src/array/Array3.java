package array;

public class Array3 {
	public static void main(String[] args) {
		int[][] a = new int[7][8];
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		int[][]  myArr = { {1},{1,2},{1,2,3,},{1,2,3,4},{1,2,3,4,5} };
		for(int[]e1 : myArr) {        //两个for each循环，外层循环得到一个数组
			for(int e2 : e1) {        //再用这个数组进行for each循环，得到数组里面的值
				System.out.print(e2);
			}
			System.out.println();
		}
	}
}
