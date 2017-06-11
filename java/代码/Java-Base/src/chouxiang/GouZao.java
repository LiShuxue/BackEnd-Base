package chouxiang;

public class GouZao {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("第一个对象：" + s1);
		
		Student s2 = new Student(1, "张");
		System.out.println("第二个对象：" + s2);
		
		Student s3 = new Student(1, "lisi", 20, "beijing", "lisi@163.com", "11472583693", "无");
		System.out.println("第三个对象：" + s3);
	}
}

class Student {
	
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
	
	public Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	
	public Student() {
		
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