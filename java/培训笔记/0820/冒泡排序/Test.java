package com.zyw;

import java.util.Arrays;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * 	��һ�֣��Ƚ�4�Σ�
		 * 		1.	21345
		 * 		2.	23145
		 * 		3.	23415
		 * 		4.	23451		��һ�ֽ�������1�ƶ������
		 * 	�ڶ��֣��Ƚ�3��
		 * 		1.	32451
		 * 		2.	34251
		 * 		3.	34521		�ڶ��ֽ�������2�ƶ������ڶ�λ
		 * 	�����֣��Ƚ�2��
		 * 		1.	43521
		 * 		2.	45321		�����ֽ�������3�ƶ���������λ
		 * 	�����֣��Ƚ�1��
		 * 		1.	54321		�����ֽ�������4�ƶ���������λ
		 * 
		 * 	������		����			���鳤��-1
		 * 		ÿһ�ֵıȽϴ���		���鳤��-1-��ǰ����
		 */
		
		//������Ӵ�С����		ð������
		int[] arr = {1,2,3,4,5};
		//5����ִ��4�ֱȽ�		i�������� i��ֵ���ǵ�ǰ���� ��0��ʼ
		for(int i=0; i<arr.length-1; i++){
			//ÿһ�ֽ���С�����ƶ�����������
			for(int j=0; j<arr.length-i-1; j++){	//j=0 j<3
				//�Ƚ����ڵ������������ǰ��С�ں��ߣ��ͽ����ǵ���λ��
				if(arr[j] < arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

class Demo{
	private int k;

	public Demo(int k) {
		super();
		this.k = k;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
}
