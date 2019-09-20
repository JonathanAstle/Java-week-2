package com.qa.fourPillarsRecap;

public class Game extends sportsGame{ //I think this is poor naming because sportsGame is a Game, not the other way round
	private String name;
	private int score;
	private int timeInMinutes;
	
	public Game(int score, int timeInMinutes, String name) {
		this.score = score;
		this.timeInMinutes = timeInMinutes;
		this.name = name;
	}
	
	public Game(int score, String name) { //overloading
		this.score = score;
		this.name = name;
	}
	
	public void addToScore(int score) {
		this.score += score; //we want to add to current score rather than replace it
	}
	
	public void additionalTime(int minutes) {
		this.timeInMinutes += minutes;
	}
	
	public void setNmae(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}
	
	public int getTimeInMinutes() {
		return this.timeInMinutes;
	}
	
}
