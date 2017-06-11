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
			System.out.print("������ѧ��������");
			a.inputName(input.next());
		}
		
		a.outputName();
		
		System.out.print("\n\n������Ҫ�޸ĵ�ѧ����������");
		String name1 = input.next();
		System.out.print("�������µ�ѧ��������");
		String name2 = input.next();
		System.out.println("\n--------�޸Ľ��-------");
		
		if(a.alter(name1, name2)) {
			System.out.println("�ҵ����޸�!!!");
		}else{
			System.out.println("�޸�ʧ��...");
		}
		
		System.out.println();
		a.outputName();
	}
	
}
