package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class MyConvertAction extends ActionSupport {
	//���������������������ݣ�ͨ���Զ�ת��
	private Integer intnum;
	private Double doublenum;
	private Boolean bool;
	private Character ch;
	private Date da;
	private String[] check;
	private String[] arr;
	private List<String> list = new ArrayList<String>();
	private Map<String, String> map = new HashMap<String, String>();
	
	@Override
	public String execute() throws Exception {
		System.out.println("����:" + intnum);
		System.out.println("С��:" + doublenum);
		System.out.println("����:" + bool);
		System.out.println("�ַ�:" + ch);
		System.out.println("����:" + da);
		System.out.println("����1:" + Arrays.toString(check));
		System.out.println("����2:" + Arrays.toString(arr));
		System.out.println("���ϣ�" + list.size());
		System.out.println("map:" + map.size());
		return null;
	}

	
	public Integer getIntnum() {
		return intnum;
	}

	public void setIntnum(Integer intnum) {
		this.intnum = intnum;
	}

	public Double getDoublenum() {
		return doublenum;
	}

	public void setDoublenum(Double doublenum) {
		this.doublenum = doublenum;
	}

	public Boolean getBool() {
		return bool;
	}

	public void setBool(Boolean bool) {
		this.bool = bool;
	}

	public Character getCh() {
		return ch;
	}

	public void setCh(Character ch) {
		this.ch = ch;
	}
	
	public Date getDa() {
		return da;
	}
	
	public void setDa(Date da) {
		this.da = da;
	}
	
	public String[] getCheck() {
		return check;
	}

	public void setCheck(String[] check) {
		this.check = check;
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	
	
}
