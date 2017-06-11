package jihe;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		//set�����������ظ���Ԫ��
		
		Set set = new HashSet();  
		Student2 stu = new Student2(1, "zhangsan");
		set.add(stu);
		set.add(stu);
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		System.out.println("Ԫ��������" + set.size());
		
		for(Object obj : set) {
			System.out.println(obj);
		}
		
	}
}

class Student2{
	private int id;
	private String name;
	
	public Student2() {
		super();
	}
	
	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
