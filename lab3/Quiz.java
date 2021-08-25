/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        3
*/

// 2021-08-25

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	private ArrayList<Question> questions = new ArrayList<Question>();

	public void add_question() {
		int difficulty;

		String question, answer;
		Scanner input = new Scanner(System.in);
		Question new_question;

		System.out.println("What is the question Text?");
		question = input.nextLine();

		System.out.println("What is the answer?");
		answer = input.nextLine();

		System.out.println("How Difficult (1-3)?");
		difficulty = input.nextInt();

		questions.add(new Question(question, answer, difficulty));
	}

	public void remove_question() {
		int question_index;

		Scanner input = new Scanner(System.in);

		System.out.println("Choose the question to remove?");
		for (int i = 0; i < questions.size(); i++)
			System.out.println(i + ". " + questions.get(i).get_question());

		question_index = input.nextInt();
		questions.remove(question_index);
	}

	public void modify_question() {
		int question_index;
		int difficulty;

		String question, answer;
		Scanner input = new Scanner(System.in);

		System.out.println("Choose the question to modify?");
		for (int i = 0; i < questions.size(); i++)
			System.out.println(i + ". " + questions.get(i).get_question());

		question_index = input.nextInt();
		input.nextLine();

		System.out.println("What is the question Text?");
		question = input.nextLine();

		System.out.println("What is the answer?");
		answer = input.nextLine();

		System.out.println("How Difficult (1-3)?");
		difficulty = input.nextInt();

		questions.get(question_index).set_question(question);
		questions.get(question_index).set_answer(answer);
		questions.get(question_index).set_difficulty(difficulty);
	}

	public void give_quiz() {
		int correct = 0;

		String answer;
		Scanner input = new Scanner(System.in);

		for (Question q : questions) {
			System.out.println(q.get_question());
			answer = input.nextLine();
			if (answer.equals(q.get_answer())) {
				System.out.println("Correct");
				correct++;
			} else
				System.out.println("Incorrect");
		}

		System.out.println("You got " + correct + " out of " + questions.size());
	}
}
