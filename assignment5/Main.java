/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 5
*/

// 2021-09-20
// 2021-09-21

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String selection;
    Scanner input = new Scanner(System.in);

    BasicGame game;

    System.out.println("What size board do you want? (Small or Big)");
    selection = input.nextLine();

    game = new BasicGame(selection);

    do {
      System.out.println(game + "\n");

      System.out.println("Q to quit, or move by pressing:\n" + " 8\n4 6\n 2");

      selection = input.nextLine();
      switch (selection) {
        case "Q":
          break;
        case "8":
          game.moveUp();
          break;
        case "4":
          game.moveLeft();
          break;
        case "6":
          game.moveRight();
          break;
        case "2":
          game.moveDown();
          break;
        default:
          System.out.println(selection + ": illegal move");
          break;
      }
    } while (!selection.equals("Q"));
  }
}
