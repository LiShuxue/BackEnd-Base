package oop;

import java.util.Scanner;

public class AlterName implements AlterNameInterface{
	private String[] names = new String[5];

	public void inputName(String name) {
		for(int i=0; i<names.length; i++) {
			if(null == names[i]) {
				names[i] = name;
				break;
			}
		}
	}
	
	public boolean alter(String name1, String name2) {
		for(int i=0; i<names.length; i++) {
			if(name1.equals(names[i])) {
				names[i] = name2;
				return true;
			}
		}
		return false;
	}
	
	public void outputName() {
		System.out.println("学生列表：");
		for(String name: names) {
			if(name != null) {
				System.out.print(name + "\t");
			}
		}
	}

}
