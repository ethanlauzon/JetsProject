package com.skilldistillery.jets.app;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

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
		System.out.println( "1.List fleet" + "\n2.Fly all jets" + "\n3.View fastest jet" + "\n4.View jet with longest range"
				+ "\n5.Load all Cargo Jets" + "\n6.Dogfight!" + "\n7.Add a jet to Fleet" + "\n8.Remove a jet from Fleet"
				+ "\n9.Quit");
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

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

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
