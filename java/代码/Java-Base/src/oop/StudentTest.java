package oop;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "李明";
		s.age = 20;
		s.classNo = "1年3班";
		s.hobby = "打篮球";
		
		s.show();
		
		Student s2 = new Student();
		s2.show();
	}
}
