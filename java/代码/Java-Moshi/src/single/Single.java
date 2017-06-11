package single;

public class Single {
	public static void main(String[] args) {
		
		System.out.println(Student.getInstance());
		System.out.println(Student.getInstance());
		System.out.println(Student.getInstance());
		
	}
}

class Student{
	
	private static Student stu = null;
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		if(stu==null) {
			stu = new Student();
		}
		return stu;
	}
}