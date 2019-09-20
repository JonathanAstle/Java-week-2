package com.qa.builder;

public class Trainee {
	private String name;
	private int age;
	private String technology; 
	
	public Trainee(String name, int age, String technology) {
		this.name = name;
		this.age = age;
		this.technology = technology;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTechnology() {
		return technology;
	}
	
	public void setTechnology(String technology) {
		this.technology = technology;
	}
}
