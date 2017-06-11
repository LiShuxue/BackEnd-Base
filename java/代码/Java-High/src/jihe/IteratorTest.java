package jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "name1"));
		list.add(new Student(2, "name2"));
		list.add(new Student(3, "name3"));
		list.add(new Student(4, "name4"));
		list.add(new Student(5, "name5"));
		
		
		Iterator<Student> iter = list.iterator();      //ͨ��list��ȡ������
		
		while(iter.hasNext()){               //�ж��Ƿ�����һ��Ԫ��
			Student stu = iter.next();          //ÿ��next�������α궼������ƶ�һ��λ��
			System.out.println(stu.getName());
		}
	}
}
