package com.qa.builder;

public class TraineeBuilder {
	private String name;
	private int age = 0;
	private String technology;
	
	public TraineeBuilder() {
		// this doesn't need to be here
	}
	
	public Trainee buildTrainee() {
		return new Trainee(name, age, technology);
	}
	
	public TraineeBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public TraineeBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public TraineeBuilder technology(String technology) {
		this.technology = technology;
		return this;
	}
}
