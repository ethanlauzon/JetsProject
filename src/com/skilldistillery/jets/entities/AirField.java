package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	public List<Jet> getAirStrip() {
		return airStrip;
	}
	
	private List<Jet> airStrip = new ArrayList<>();

	public void readFromFile() {

		try {
			FileReader fr = new FileReader("jets.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				Jet j = null;
				String[] jetInfo = line.split(",");
				String type = jetInfo[0];
				String model = jetInfo[1];
				double speed = Double.parseDouble(jetInfo[2]);
				int range = Integer.parseInt(jetInfo[3]);
				Long price = Long.parseLong(jetInfo[4]);
				if (type.equalsIgnoreCase("passenger")) {
					j = new PassengerJet(type, model, range, price, speed);
				} else if (type.equalsIgnoreCase("fighter")) {
					j = new FighterJet(type, model, range, price, speed);
				} else if (type.equalsIgnoreCase("cargo")) {
					j = new CargoJet(type, model, range, price, speed);
				}
				airStrip.add(j);

			}
			br.close();
		} catch (IOException e) {
			System.err.println("Problem while reading " + ": " + e.getMessage());
			return;
		}

	}

}
