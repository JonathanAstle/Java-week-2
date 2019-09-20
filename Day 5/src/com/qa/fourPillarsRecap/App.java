package com.qa.fourPillarsRecap;

public class App {

	public static void main(String[] args) {
		Game semi_finals = new Game(0, 90, "football");

		Game grand_final = new Game(1500, "poker");

		Tennis first_round = new Tennis(1, 15, "tennis");
		
		System.out.println(first_round.getScore());
		
		Game wimbledon = new Tennis(2, 0, "tennis");
		
		System.out.println(wimbledon.getScore());
	}

}