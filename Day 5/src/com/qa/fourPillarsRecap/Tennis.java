package com.qa.fourPillarsRecap;

public class Tennis extends Game {
	public Tennis(int score, int timeInMinutes, String name) {
		super(score, timeInMinutes, name);
	}
	
	@Override
	public int getScore() {
		return super.getScore() * 15;
	}
}
