/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        2
*/

// 2021-08-24

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int selection = 0;
		StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
		StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);

		while (selection != 8) {

			System.out.println("1. Sold One Milk\n"
			                   + "2. Sold One Bread\n"
			                   + "3. Change price of Milk\n"
			                   + "4. Change price of Bread\n"
			                   + "5. Add Milk to Inventory\n"
			                   + "6. Add Bread to Inventory\n"
			                   + "7. See Inventory\n"
			                   + "8. Quit\n");

			selection = input.nextInt();

			switch (selection) {
				case 1:
					milk.lowerQuantity(1);
					break;
				case 2:
					bread.lowerQuantity(1);
					break;
				case 3:
					System.out.println("What is the new price for Milk");
					milk.setPrice(input.nextFloat());
					break;
				case 4:
					System.out.println("What is the new price for Bread");
					bread.setPrice(input.nextFloat());
					break;
				case 5:
					System.out.println("How many milk did we get?");
					milk.raiseQuantity(input.nextInt());
					break;
				case 6:
					System.out.println("How many bread did we get?");
					bread.raiseQuantity(input.nextInt());
					break;
				case 7:
					System.out.println(milk);
					System.out.println(bread);
					break;
			}
		}
	}
}
