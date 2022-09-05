package com.skilldistillery.jets.app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApplication {
	Jet j = null;
	AirField jl = new AirField();
	List<Jet> airField = jl.getAirStrip();
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();
	}

	public void launch() {
		jl.readFromFile();
		selectionMenu();
	}

	public void menu() {
		System.out.println("1.List fleet" + "\n2.Fly all jets" + "\n3.View fastest jet"
				+ "\n4.View jet with longest range" + "\n5.Load all Cargo Jets" + "\n6.Dogfight!"
				+ "\n7.Add a jet to Fleet" + "\n8.Remove a jet from Fleet" + "\n9.Quit");
	}

	public void selectionMenu() {

		JetsApplication jm = new JetsApplication();
		boolean loop = true;
		while (loop) {
			menu();
			int choice = kb.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < airField.size(); i++) {
					System.out.println(airField.get(i));
				}
				break;
			case 2:
				for (Jet jet : airField) {
					jet.fly();
				}
				break;
			case 3:
				for (Jet jet : airField) {

				}
				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				System.out.println("Enter a type of plane" + "\nPlease type in passenger, cargo, or fighter" );
				String type = kb.next();
				System.out.println("Enter a model of plane");
				String model = kb.next();
				System.out.println("Enter range of plane");
				int range = kb.nextInt();
				System.out.println("Enter price of plane");
				long price = kb.nextLong();
				System.out.println("Enter speed of plane");
				double speed = kb.nextDouble();
				if (type.equalsIgnoreCase("passenger")) {
					j = new PassengerJet(type, model, range, price, speed);
				} else if (type.equalsIgnoreCase("fighter")) {
					j = new FighterJet(type, model, range, price, speed);
				} else if (type.equalsIgnoreCase("cargo")) {
					j = new CargoJet(type, model, range, price, speed);
				}
				airField.add(j);
				break;
			case 8:

				for (int i = 0; i < airField.size(); i++) {
					System.out.println(airField.get(i));
				}
				System.out.println("Enter the number of the jet you would like to remove ");
				int selection = kb.nextInt();
				selection = selection - 1;
				airField.remove(selection);

				break;
			case 9:
				System.out.println("Goodbye");
				loop = false;
				break;
			default:
				System.out.println("Invalid entry, please use numbers");
			}

		}
		kb.close();
	}
}
