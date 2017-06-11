package jihe;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();//后面<>中不用写
		Student2 stu1 = new Student2(1, "zhangsan");
		Student2 stu2 = new Student2(2, "lisi");
		Student2 stu3 = new Student2(3, "wangwu");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		//list.add(100);     //加上泛型以后就不能添加其他类型的数据了
		for(Student2 s : list){    //并且加上泛型以后这里就不用通过object来接收了，不需要强制转换了
			System.out.println(s.getId() + "\t" + s.getName());
		}
		System.out.println("--------------------");
		
		//将一个对象保存在集合中，该对象的状态改变了，集合中保存的对象的状态也会改变，因为保存对象保存的是对象的引用
		stu1.setName("lisi");  //修改该对象的名字
		stu3.setName("lisi");
		for(Student2 s : list){     //并且加上泛型以后这里就不用通过object来接收了，不需要强制转换了
			System.out.println(s.getId() + "\t" + s.getName());
		}
	}
}

class Student{
	private int id;
	private String name;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name) {
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
