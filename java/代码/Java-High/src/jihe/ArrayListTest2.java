package jihe;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();//����<>�в���д
		Student2 stu1 = new Student2(1, "zhangsan");
		Student2 stu2 = new Student2(2, "lisi");
		Student2 stu3 = new Student2(3, "wangwu");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		//list.add(100);     //���Ϸ����Ժ�Ͳ�������������͵�������
		for(Student2 s : list){    //���Ҽ��Ϸ����Ժ�����Ͳ���ͨ��object�������ˣ�����Ҫǿ��ת����
			System.out.println(s.getId() + "\t" + s.getName());
		}
		System.out.println("--------------------");
		
		//��һ�����󱣴��ڼ����У��ö����״̬�ı��ˣ������б���Ķ����״̬Ҳ��ı䣬��Ϊ������󱣴���Ƕ��������
		stu1.setName("lisi");  //�޸ĸö��������
		stu3.setName("lisi");
		for(Student2 s : list){     //���Ҽ��Ϸ����Ժ�����Ͳ���ͨ��object�������ˣ�����Ҫǿ��ת����
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
