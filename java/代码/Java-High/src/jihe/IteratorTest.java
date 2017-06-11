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
		
		
		Iterator<Student> iter = list.iterator();      //通过list获取迭代器
		
		while(iter.hasNext()){               //判断是否有下一个元素
			Student stu = iter.next();          //每次next（），游标都会向后移动一个位置
			System.out.println(stu.getName());
		}
	}
}
