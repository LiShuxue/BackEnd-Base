package com.zyw;

public class Test {

	public static void main(String[] args) {
		
		/*	方法的    重载
		 * 	在同一个类中的“多个”方法可以重名(相同方法名)，
		 * 	为什么需要重载？ 相同方法名 更加好记
		 * 	但要保证他们 的参数不同：
		 * 		类型不同、数量不同、顺序不同
		 * 	返回值类型与方法重载没有关系
		 * 	相同名字的方法，返回值不同，参数相同，是错误的
		 * 
		 * 	声明方法时，方法上的参数， 叫做形参
		 * 	调用方法时，向方法中传的数据（变量），叫做实参
		 */
		
		Test t = new Test();
		//通过t来调用myMehtod，选择你需要什么参数的方法
		t.myMehtod(100);
	}
	
	public void myMehtod(int num){
		
	}
	//数量不同
	public void myMehtod(){
		
	}
	//类型不同
	public void myMehtod(double num){
		
	}
	//参数顺序不同
	public void myMehtod(int num1,double num2){
		
	}
	public void myMehtod(double num2,int num1){
		
	}
}










