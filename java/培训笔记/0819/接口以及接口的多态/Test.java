package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//创建一个昊晨
		Person p = new Person("haochen");
		//昊晨都能干什么？
		p.coquetry();
		p.study();
		p.work();
		//如果昊辰来到学校，是一个学生的时候
		System.out.println("-------到学校---------");
		IStudent student = p;	//多态
		student.study();	//只能学习，做不了别的事情
		System.out.println("---------到了公司---------");
		IEmployee emp = p;	//多态
		emp.work();
		System.out.println("--------回到了家，遇见了妈妈--------");
		ISon son = p;	//多态
		son.coquetry();
		System.out.println("-----------------------");
		
		new Test().work(p);
	}
	
	/**
	 * 需要一个员工来工作
	 * @param e
	 */
	public void work(IEmployee e){
		e.work();
	}

}
/**
 *  implements实现接口，多个逗号隔开
 *
 */
class Person implements IStudent,IEmployee,ISon{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void coquetry() {
		System.out.println(name + "正在撒娇");
	}

	@Override
	public void work() {
		System.out.println(name + "正在工作");
	}

	@Override
	public void study() {
		System.out.println(name + "正在学习");
	}
}

/**
 * 学生角色，学习方法
 */
interface IStudent{
	void study();
}

/**
 * 儿子角色，撒娇方法
 */
interface ISon{
	void coquetry();
}

/**
 * 员工角色，工作
 */
interface IEmployee{
	void work();
}







