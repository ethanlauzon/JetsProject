package com.skilldistillery.jets.entities;

public abstract class Jet {

	@Override
	public String toString() {
		return "Type = " + type + ", Model = " + model + ", Range = " + range + ", Price = " + price + ", Speed = "
				+ speed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Jet(String type, String model, int range, long price, double speed) {
		this.type = type;
		this.model = model;
		this.range = range;
		this.price = price;
		this.speed = speed;
	}

	public void fly() {
		double time = range / speed;
		double mach = speed * .00130332;
		System.out.println("Type = " + type + ", Model = " + model + ", Range = " + range + ", Price = " + price
				+ ", Speed = " + speed + "Speed in Mach = " + mach + " Hours until Refuel = " + time);
	}

	public Jet() {
	}

	private String type;
	private String model;
	private int range;
	private long price;
	private double speed;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
