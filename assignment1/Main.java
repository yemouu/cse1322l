/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 1
*/

// 2021-08-24

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Pasted from assignment
		Notes twenties = new Notes(20);
		Notes tens = new Notes(10);
		Notes fives = new Notes(5);
		Notes ones = new Notes(1);
		Coins quarters = new Coins(0.25f, 0.2f);
		Coins dimes = new Coins(0.10f, 0.08f);
		Coins nickels = new Coins(0.05f, 0.176f);
		Coins pennies = new Coins(0.01f, 0.088f);
		dimes.increaseQuantity(41);
		nickels.increaseQuantity(17);
		pennies.increaseQuantity(132);
		ones.increaseQuantity(33);
		fives.increaseQuantity(12);
		tens.increaseQuantity(2);
		twenties.increaseQuantity(5);

		// Amount of Notes
		System.out.println(twenties);
		System.out.println(tens);
		System.out.println(fives);
		System.out.println(ones);

		// Amount of Coins
		System.out.println(quarters);
		System.out.println(dimes);
		System.out.println(nickels);
		System.out.println(pennies);

		// Calculate the Total Value of the money
		float totalValue = twenties.getTotalValue()
		                   + tens.getTotalValue()
		                   + fives.getTotalValue()
		                   + ones.getTotalValue()
		                   + quarters.getTotalValue()
		                   + dimes.getTotalValue()
		                   + nickels.getTotalValue()
		                   + pennies.getTotalValue();

		// Calculate the Total Weight of the coins
		float totalWeight = quarters.getTotalWeight()
		                    + dimes.getTotalWeight()
		                    + nickels.getTotalWeight()
		                    + pennies.getTotalWeight();

		System.out.println("Total Money is $" + String.format("%4.2f", totalValue)
		                   + " total weight is " + String.format("%4.3f", totalWeight)
		                   + "oz");

		Scanner input = new Scanner(System.in);
		float amountNeeded;

		System.out.println("How much do you need?");
		amountNeeded = input.nextFloat();

		// Continue to give money until we can't anymore either by no longer having enough
		// notes and coins or when amountNeeded is 0

		while ((amountNeeded >= 20f) && (twenties.getQuantityOnHand() > 0)) {
			amountNeeded -= 20f;
			twenties.decreaseQuantity(1);
			System.out.println("Give them a $20 note");
		}

		while ((amountNeeded >= 10f) && (tens.getQuantityOnHand() > 0)) {
			amountNeeded -= 10f;
			tens.decreaseQuantity(1);
			System.out.println("Give them a $10 note");
		}

		while ((amountNeeded >= 5f) && (fives.getQuantityOnHand() > 0)) {
			amountNeeded -= 5f;
			fives.decreaseQuantity(1);
			System.out.println("Give them a $5 note");
		}

		while ((amountNeeded >= 1f) && (ones.getQuantityOnHand() > 0)) {
			amountNeeded -= 1f;
			ones.decreaseQuantity(1);
			System.out.println("Give them a $1 note");
		}

		while ((amountNeeded >= 0.25f) && (quarters.getQuantityOnHand() > 0)) {
			amountNeeded -= 0.25f;
			quarters.decreaseQuantity(1);
			System.out.println("Give them a quarter");
		}

		while ((amountNeeded >= 0.1f) && (dimes.getQuantityOnHand() > 0)) {
			amountNeeded -= 0.1f;
			dimes.decreaseQuantity(1);
			System.out.println("Give them a dime");
		}

		while ((amountNeeded >= 0.05f) && (nickels.getQuantityOnHand() > 0)) {
			amountNeeded -= 0.05f;
			nickels.decreaseQuantity(1);
			System.out.println("Give them a nickel");
		}

		while ((amountNeeded >= 0.01f) && (pennies.getQuantityOnHand() > 0)) {
			amountNeeded -= 0.01f;
			pennies.decreaseQuantity(1);
			System.out.println("Give them a penny");
		}

		// Check if we have any left over. Check against 0.001 to avoid
		// a floating point error
		if (amountNeeded > 0.001f) {
			System.out.println("I don't have enough money. I still owe you $"
			                   + String.format("%4.2f", amountNeeded));
		}

		// Recalculate the Total Value of the money
		totalValue = twenties.getTotalValue()
		             + tens.getTotalValue()
		             + fives.getTotalValue()
		             + ones.getTotalValue()
		             + quarters.getTotalValue()
		             + dimes.getTotalValue()
		             + nickels.getTotalValue()
		             + pennies.getTotalValue();

		// Recalculate the Total Weight of the coins
		totalWeight = quarters.getTotalWeight()
		              + dimes.getTotalWeight()
		              + nickels.getTotalWeight()
		              + pennies.getTotalWeight();

		System.out.println("I have $" + String.format("%4.2f", totalValue)
		                   + " left, it's total weight is "
		                   + String.format("%4.3f", totalWeight) + "oz");
	}
}
