/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        9
*/

// 2021-10-12

import java.util.Scanner;

public class Main {
	public static int recursive_multiply(int a, int b) {
		if ((a == 0) || (b == 0)) return 0;
		return a + recursive_multiply(a, b-1);
	}

	public static int recursive_div(int a, int b) {
		if (b == 0) return -1;
		if (a == b) return 1;
		if (a < b) return 0;
		return 1 + recursive_div(a-b, b);
	}

	public static int recursive_mod(int a, int b) {
		if (b == 0) return -1;
		if (a < b) return a;
		return recursive_mod(a-b, b);
	}

	public static void main(String[] args) {
		int a, b, selection;

		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("Choose from the following:\n"
			                   + "0.  Quit\n"
			                   + "1.  Multiply 2 numbers\n"
			                   + "2.  Div 2 numbers\n"
			                   + "3.  Mod 2 numbers");

			selection = input.nextInt();
			if (selection == 0) break;

			System.out.println("Enter first number");
			a = input.nextInt();

			System.out.println("Enter second number");
			b = input.nextInt();

			switch(selection) {
				case 1:
					System.out.println("Answer: " + recursive_multiply(a, b));
					break;
				case 2:
					System.out.println("Answer: " + recursive_div(a, b));
					break;
				case 3:
					System.out.println("Answer: " + recursive_mod(a, b));
					break;
			}
		}
	}
}
