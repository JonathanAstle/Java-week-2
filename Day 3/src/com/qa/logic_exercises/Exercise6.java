package com.qa.logic_exercises;

import java.util.ArrayList;

public class Exercise6 {
	public static void main(String[] args) {
		Exercise6 app = new Exercise6();
		
		ArrayList<Integer> array1To100 = app.createArrayRange(1, 10);
		ArrayList<Integer> array100To999 = app.createArrayRange(100, 999);
		ArrayList<Integer> array100To999Times10 = app.multiplyArrayBy(array100To999, 10);
		
		System.out.println(array100To999Times10);
	}	
	
	
	public ArrayList<Integer> createArrayRange(int a, int b) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = a; i<=b; i++) {
			numbers.add(i);
		}
		
		return numbers;
	}
	
	public ArrayList<Integer> multiplyArrayBy(ArrayList<Integer> array, int a) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int number: array) {
			numbers.add(number*a);
		}
		
		return numbers;
	}
}
