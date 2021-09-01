/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 2
*/

// 2021-08-30
// 2021-09-01

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int length;
		int selection;

		String inWord;
		Scanner input = new Scanner(System.in);
		English english = new English();

		System.out.println("How many letters are in the word?");
		length = input.nextInt();
		input.nextLine();

		do {
			System.out.println("Do you want me to look for letters or a pattern?\n"
			                   + "1. Letters\n"
			                   + "2. Pattern");
			selection = input.nextInt();
			input.nextLine();
		} while((selection != 1) && (selection != 2)) ;

		if (selection == 1) {
			System.out.println("What letters are in the word?");
			inWord = input.nextLine();
			System.out.println("It might be any of these...");
			guessWordWithLetters(english, length, inWord);
		} else if (selection == 2) {
			System.out.println("What pattern is in the word?");
			inWord = input.nextLine();
			System.out.println("It might be any of these...");
			guessWordWithPattern(english, length, inWord);
		}
	}

	public static boolean wordContainsLetter(String word, char letter) {
		char[] wordCharArray = word.toCharArray();

		for (char l : wordCharArray)
			if (l == letter)
				return true;
		return false;
	}

	public static boolean wordContainsString(String word, String pattern) {
		return word.contains(pattern);
	}

	public static void guessWordWithLetters(English english, int length, String letters) {
		char[] lettersArray = letters.toCharArray();

		for (String word : english.words) {
			if (word.length() != length)
				continue;

			boolean print = true;
			for (char letter : lettersArray)
				if (! wordContainsLetter(word, letter)) {
					print = false;
					break;
				}

			if (print)
				System.out.println(word);
		}
	}

	public static void guessWordWithPattern(English english, int length, String pattern) {
		for (String word : english.words) {
			if (word.length() != length)
				continue;

			if (wordContainsString(word, pattern))
				System.out.println(word);
		}
	}
}
