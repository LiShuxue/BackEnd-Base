package com.zyw;

public class Test {

	public static void main(String[] args) {
		
		/**
		 *  匿名对象
		 *  当你在程序创建的对象只使用了一次 或者
		 *  	该对象仅仅调用了一次方法
		 *  我们可以不将这个对象保存到 "变量中"
		 */
		System.out.println(new Student().getSname());
		/**
		 * new Student()	就是创建了一个对象，但是我们并没有给他制定一个名字
		 * 在使用它调用 getSname() 之后，我们无法再使用 "它"了
		 * 我们将这个没有名字的 student对象，称为  匿名对象
		 * 每次 new Student()，都会创建一个新的 student对象
		 */
	}

}

class Student{
	
	private int sid;
	private String sname;
	private int age;
	private String address;
	private String email;
	private String phone;
	private String remark;
	
	public Student(int sid, String sname, int age, String address,
			String email, String phone, String remark) {

		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.remark = remark;
	}
	
	public Student(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}
	
	public Student(){
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}












