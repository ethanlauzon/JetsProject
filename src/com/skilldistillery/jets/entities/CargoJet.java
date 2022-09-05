package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoLoading {

	public CargoJet(String type,String model,int range, long price, double speed) {
		setType(type);
		setModel(model);
		setRange(range);
		setPrice(price);
		setSpeed(speed);
	}

	public void loadCargo() {
		System.out.println("Loading cargo...");
		System.out.println("Finished loading...");
		
	}

}
