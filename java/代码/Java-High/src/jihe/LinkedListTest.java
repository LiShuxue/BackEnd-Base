package jihe;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//LinkedList֧��ͷβ����
		LinkedList<Student> list = new LinkedList<Student>();
		
		list.addFirst(new Student(1, "zhangsan"));  //��ӵ�ͷ��
		list.addFirst(new Student(2, "lisi"));
		list.addLast(new Student(3, "wangwu"));      //��ӵ�β��
		
		System.out.println(list.getFirst());        //��ȡ��һ��
		System.out.println(list.getLast());         //��ȡ���һ��
		
		System.out.println(list.removeFirst());    //�Ƴ���һ��
		System.out.println(list.removeLast());     //�Ƴ����һ��
	}
}
