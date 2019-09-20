package com.qa.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String string = sc.next();
		System.out.println("the string was: " + string);
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Okay, your name is: " + name);
		
		System.out.println("Please enter a number: ");
		while (!sc.hasNextInt()) {
			System.out.println("That's not a number! Try again! ");
			sc.next();
		}
		int number = sc.nextInt();
		System.out.println("Number you typed was " + number);
		
		
		
		sc.close();
	}

}
