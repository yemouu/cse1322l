/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        6
*/

// 2021-09-19

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);

		FibFormula fibForm = new FibFormula();
		FibIteration fibIter = new FibIteration();

		System.out.println("Enter the number you want to find the Fibonacci Series for:");
		n = input.nextInt();

		System.out.println("Fib of " + n + " by iteration is: " + fibIter.calculate_fib(n) + "\n"
		                   + "Fib of " + n + " by formula is: " + fibForm.calculate_fib(n) + "\n");
	}
}
