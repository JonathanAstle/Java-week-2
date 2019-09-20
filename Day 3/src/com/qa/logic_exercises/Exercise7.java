package com.qa.logic_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise7 {

	public static void main(String[] args) {
		ArrayList<Integer> array1To100 = createArrayRange(1, 100);
		ArrayList<Integer> array100To999 = createArrayRange(100, 999);
		ArrayList<Integer> array100To999Times10 = multiplyArrayBy(array100To999, 10);
		
		System.out.println(array1To100);
		System.out.println(array100To999Times10);
	}
	
	
	
	
	
	public static ArrayList<Integer> createArrayRange(int a, int b) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		IntStream.range(a, b+1).forEach(x -> numbers.add(x));
		
		return numbers;
	}
	
	public static ArrayList<Integer> multiplyArrayBy(ArrayList<Integer> list, int a) {
		//ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Stream.of(list).map(x -> x*10);
		
		return list;
	}
	

}
