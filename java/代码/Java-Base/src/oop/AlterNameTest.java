package oop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class AlterNameTest {
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		//AlterName a = new AlterName();
		
		Properties prop = new Properties();
		InputStream is = AlterNameTest.class.getClassLoader().getResourceAsStream("config.properties");
		prop.load(is);
		String value = prop.getProperty("alterNameDAO");
		
		AlterNameInterface a = (AlterNameInterface)(Class.forName(value).newInstance());
		
		for(int i=0; i<5; i++ ) {
			System.out.print("请输入学生姓名：");
			a.inputName(input.next());
		}
		
		a.outputName();
		
		System.out.print("\n\n请输入要修改的学生的姓名：");
		String name1 = input.next();
		System.out.print("请输入新的学生姓名：");
		String name2 = input.next();
		System.out.println("\n--------修改结果-------");
		
		if(a.alter(name1, name2)) {
			System.out.println("找到并修改!!!");
		}else{
			System.out.println("修改失败...");
		}
		
		System.out.println();
		a.outputName();
	}
	
}
