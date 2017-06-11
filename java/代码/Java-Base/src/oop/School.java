package oop;

public class School {
	
	String schoolName;
	int classNumber;
	int labNumber;
	
	public void showMessage() {
		System.out.println(schoolName + "，有教室" + classNumber + "间，机房" + labNumber + "间");
	}
}
