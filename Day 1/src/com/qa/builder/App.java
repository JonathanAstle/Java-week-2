package com.qa.builder;

public class App {

	public static void main(String[] args) {
		Trainee t1 = new TraineeBuilder().age(7).name("David").buildTrainee();
		
		System.out.println(t1);
		System.out.println(t1.getAge());
		System.out.println(t1.getName());
		System.out.println(t1.getTechnology());
	}

}
