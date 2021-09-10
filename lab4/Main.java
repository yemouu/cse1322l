/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        4
*/

// 2021-09-08

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double amount = 0;
		int selection = 0;

		Checking checking = new Checking();
		Savings savings = new Savings();

		Scanner input = new Scanner(System.in);

		while (selection != 8) {
			System.out.println("1. Withdraw from Checking\n"
			                   + "2. Withdraw from Savings\n"
			                   + "3. Deposit to Checking\n"
			                   + "4. Deposit to Savings\n"
			                   + "5. Balance of Checking\n"
			                   + "6. Balance of Savings\n"
			                   + "7. Award Interest to Savings now\n"
			                   + "8. Quit" );
			selection = input.nextInt();

			switch (selection) {
				case 1:
					System.out.println("How much would you like to withdraw "
					                   + "from Checking?");
					amount = input.nextDouble();
					checking.withdrawl(amount);
					break;
				case 2:
					System.out.println("How much would you like to withdraw "
					                   + "from Savings?");
					amount = input.nextDouble();
					savings.withdrawl(amount);
					break;
				case 3:
					System.out.println("How much would you like to deposit "
					                   + "into Checking?");
					amount = input.nextDouble();
					checking.deposit(amount);
					break;
				case 4:
					System.out.println("How much would you like to deposit "
					                   + "into Savings?");
					amount = input.nextDouble();
					savings.deposit(amount);
					break;
				case 5:
					System.out.println("Your balance for checking "
					                   + checking.get_account_number() + " is "
					                   + checking.get_account_balance());
					break;
				case 6:
					System.out.println("Your balance for savings "
					                   + savings.get_account_number() + " is "
					                   + savings.get_account_balance());
					break;
				case 7:
					savings.add_interest();
					break;
			}
		}
	}
}
