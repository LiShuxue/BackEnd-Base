package oop;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "����";
		s.age = 20;
		s.classNo = "1��3��";
		s.hobby = "������";
		
		s.show();
		
		Student s2 = new Student();
		s2.show();
	}
}
