package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet{

	public PassengerJet(String type,String model,int range, long price, double speed) {
		setType(type);
		setModel(model);
		setRange(range);
		setPrice(price);
		setSpeed(speed);
	}

}
