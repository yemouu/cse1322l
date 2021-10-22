/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        3
*/

// 2021-08-25

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int selection = 0;

    Scanner input = new Scanner(System.in);
    Quiz quiz = new Quiz();

    while (selection != 5) {
      System.out.println(
          "What would you like to do?\n"
              + "1. Add a question to the quiz\n"
              + "2. Remove a question from the quiz\n"
              + "3. Modify a question in the quiz\n"
              + "4. Take the quiz\n"
              + "5. Quit");

      selection = input.nextInt();

      switch (selection) {
        case 1:
          quiz.add_question();
          break;
        case 2:
          quiz.remove_question();
          break;
        case 3:
          quiz.modify_question();
          break;
        case 4:
          quiz.give_quiz();
          break;
      }
    }
  }
}
