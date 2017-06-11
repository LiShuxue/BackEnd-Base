package com.zyw.gradation1;

public class Items {

	private Integer id;
	private String name;
	private String publishers;
	
	public Items(String name, String publishers) {
		super();
		this.name = name;
		this.publishers = publishers;
	}

	public Items() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishers() {
		return publishers;
	}

	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}
	
	
}
