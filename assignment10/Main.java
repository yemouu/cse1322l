/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 10
*/

// 2021-10-30

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean success = false;
    int selection = -1;
    ConnectFour game = new ConnectFour();
    Scanner input = new Scanner(System.in);

    while (selection != 9) {
      while (success == false) {
        try {
          System.out.println(game);
          System.out.println(
              "Which column would " + game.getCurrentTurn() + " like to go in (9 to quit)");
          selection = input.nextInt();

          if (selection == 9) break;
          else if ((selection >= 0) && (selection <= 6)) {
            game.dropPiece(selection);
            game.nextTurn();
          } else {
            System.out.println(selection + " is not a valid option (0-6 or 9)");
            continue;
          }

          success = true;
        } catch (ColumnFull e) {
          System.out.println("Column " + selection + " is full, pick another column");
        } catch (InputMismatchException e) {
          System.out.println(input.nextLine() + " is not a valid option (0-6 or 9)");
        }
      }

      success = false;
    }
  }
}
