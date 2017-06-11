package com.zyw;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		//返回值是否需要使用多次？
		System.out.println(t.graph(5, "*"));
	}
	
	/**
	 * 方法执行前需要什么？ 执行后是否需要结果？？
	 * 参数2个，行数，图案
	 * 返回三角形的图案字符串
	 */
	public String graph(int rows,String ico){	//方法的签名
		String img = "";	//最终的图案
		//空字符串，是一个没有字符内容的“字符串”
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				img += ico;	//连接每一行的图标
			}
			img += "\n";	//每行图标连接完后，连接一个换行
		}
		return img;	//*\n**\n***\n****\n*****\n
	}

}
