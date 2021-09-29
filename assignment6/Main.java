/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 6
*/

// 2021-09-28
// 2021-09-29

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int selection, carryOn, checkedBags;

		String name;

		ArrayList<Seat> seats = new ArrayList<Seat>();
		Scanner input = new Scanner(System.in);

		Passenger passenger;

		do {
			System.out.println("What type of ticket do you wish to sell\n"
			                   + "1. BasicEconomy\n"
			                   + "2. Economy Class\n"
			                   + "3. Business Class\n"
			                   + "4. First Class\n"
			                   + "5. Quit");
			selection = input.nextInt();

			if (selection != 5) {
				System.out.println("How many carry on bags?");
				carryOn = input.nextInt();
				input.nextLine();

				System.out.println("How many checked bags?");
				checkedBags = input.nextInt();
				input.nextLine();

				System.out.println("Passenger Name?");
				name = input.nextLine();

				passenger = new Passenger(name, carryOn, checkedBags);

				switch(selection) {
					case 1:
						seats.add(new BasicEconomySeat(passenger));
						break;
					case 2:
						seats.add(new EconomySeat(passenger));
						break;
					case 3:
						seats.add(new BusinessSeat(passenger));
						break;
					case 4:
						seats.add(new FirstClassSeat(passenger));
						break;
				}
			}
		} while(selection != 5);

		System.out.println("Manifest:");
		for (Seat s : seats)
			System.out.println(s);
	}
}
