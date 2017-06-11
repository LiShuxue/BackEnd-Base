package oop;

public class CustomerBiz {
	
	private String[] name = new String[50];
	
	public void addName(String n) {
		for(int i= 0; i<name.length; i++) {
			if(null == name[i]) {
				name[i] = n; 
				break;
				
			}
		}
	}
	
	public void showName() {
		System.out.println("*********************");
		System.out.println("\t客户列表");
		System.out.println("*********************");
		
		for(String e : name) {
			if(null != e) {
				System.out.print(e + "\t");
			}
		}
		
	}
}
