package com.zyw;

import java.util.Arrays;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * 	第一轮，比较4次，
		 * 		1.	21345
		 * 		2.	23145
		 * 		3.	23415
		 * 		4.	23451		第一轮结束，将1移动到最后
		 * 	第二轮，比较3次
		 * 		1.	32451
		 * 		2.	34251
		 * 		3.	34521		第二轮结束，将2移动到倒第二位
		 * 	第三轮，比较2次
		 * 		1.	43521
		 * 		2.	45321		第三轮结束，将3移动到倒第三位
		 * 	第四轮，比较1次
		 * 		1.	54321		第四轮结束，将4移动到倒第四位
		 * 
		 * 	分析：		轮数			数组长度-1
		 * 		每一轮的比较次数		数组长度-1-当前轮数
		 */
		
		//对数组从大到小排序		冒泡排序
		int[] arr = {1,2,3,4,5};
		//5个数执行4轮比较		i控制轮数 i的值就是当前轮数 从0开始
		for(int i=0; i<arr.length-1; i++){
			//每一轮将最小的数移动到数组的最后
			for(int j=0; j<arr.length-i-1; j++){	//j=0 j<3
				//比较相邻的两个数，如果前者小于后者，就将他们调换位置
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
