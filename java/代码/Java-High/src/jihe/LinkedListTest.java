package jihe;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//LinkedList支持头尾操作
		LinkedList<Student> list = new LinkedList<Student>();
		
		list.addFirst(new Student(1, "zhangsan"));  //添加到头部
		list.addFirst(new Student(2, "lisi"));
		list.addLast(new Student(3, "wangwu"));      //添加到尾部
		
		System.out.println(list.getFirst());        //获取第一个
		System.out.println(list.getLast());         //获取最后一个
		
		System.out.println(list.removeFirst());    //移除第一个
		System.out.println(list.removeLast());     //移除最后一个
	}
}
