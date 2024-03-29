package com.qa.logic_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(23, 7, 47, 11, 5, 8);
		
		myList.stream().sorted().forEach(System.out::println);
		
		myList.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
		
	}

}
