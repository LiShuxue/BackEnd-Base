package com.zyw;

public class Test {

	public static void main(String[] args) {
		/*
		 * 		���췽����ʹ��
		 */
		//������һ������
		Student s1 = new Student();
		System.out.println("��һ������:"+ s1);
		//�����ڶ�������
		Student s2 = new Student(1,"zhangsan");
		System.out.println("�ڶ�������:"+ s2);
		//�����ڶ�������
		Student s3 = new Student(1, "lisi", 22, "beijing", 
				"lisi@163.com", "133", "��");
		System.out.println("����������:"+ s3);
		//ͨ������������ ָ�����Ե� get����������������ֵ
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












