package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements Combat{

	public FighterJet(String type,String model, int range, long price, double speed) {
		setType(type);
		setModel(model);
		setRange(range);
		setPrice(price);
		setSpeed(speed);
	}
	public void initiateCombat() {
		System.out.println("loading guns");
		System.out.println("deploying fighter jets");
		System.out.println("mission complete");
	}

}
