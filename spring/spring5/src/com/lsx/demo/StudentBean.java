package com.lsx.demo;

import java.util.List;
import java.util.Map;
/**
 *  向该类中 注入
 *
 */
public class StudentBean {

	private String[] stuArray;
	private Student[] objArray;
	private List stuList;
	private Map stuMap;
	
	public String[] getStuArray() {
		return stuArray;
	}
	public void setStuArray(String[] stuArray) {
		this.stuArray = stuArray;
	}
	public Student[] getObjArray() {
		return objArray;
	}
	public void setObjArray(Student[] objArray) {
		this.objArray = objArray;
	}
	public List getStuList() {
		return stuList;
	}
	public void setStuList(List stuList) {
		this.stuList = stuList;
	}
	public Map getStuMap() {
		return stuMap;
	}
	public void setStuMap(Map stuMap) {
		this.stuMap = stuMap;
	}
	
	
}
