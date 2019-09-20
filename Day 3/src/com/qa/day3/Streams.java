package com.qa.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		//filtered in everything that isn't empty
		//the important bit is (string -> !string.isEmpty()) the rest is pretty much the same
		
		//this is just a sanity check for myself
		for (String string: filtered) {
			System.out.println(string);
		} //end of sanity check
		
		
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers.stream().sorted().forEach(System.out::println);
	}

}
