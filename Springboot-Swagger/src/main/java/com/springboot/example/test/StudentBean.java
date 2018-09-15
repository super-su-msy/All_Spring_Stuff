package com.springboot.example.test;


public class StudentBean {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public StudentBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private String name;
	
	
}
