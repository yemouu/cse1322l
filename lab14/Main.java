/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        14
*/

// 2021-11-21

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BlueRayCollection blueRayCollection = new BlueRayCollection();

    String selection = "";
    while (!selection.equals("0")) {
      System.out.println("0. Quit\n" + "1. Add BlueRay to collection\n" + "2. See collection");
      selection = input.nextLine();
      switch (selection) {
        case "1":
          System.out.println("What is the title?");
          String title = input.nextLine();

          System.out.println("What is the director?");
          String director = input.nextLine();

          System.out.println("What is the year of release?");
          int yearOfRelease = Integer.parseInt(input.nextLine());

          System.out.println("What is the cost?");
          double cost = Double.parseDouble(input.nextLine());

          blueRayCollection.add(title, director, yearOfRelease, cost);
          break;
        case "2":
          blueRayCollection.show_all();
          break;
      }
    }
  }
}
