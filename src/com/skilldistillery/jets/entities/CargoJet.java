package com.skilldistillery.jets.entities;

public class CargoJet extends Jet {

	public CargoJet(String type,String model,int range, long price, double speed) {
		setType(type);
		setModel(model);
		setRange(range);
		setPrice(price);
		setSpeed(speed);
	}

}
