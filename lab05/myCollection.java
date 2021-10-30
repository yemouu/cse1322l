/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        5
*/

// 2021-09-10

import java.util.Scanner;

public class myCollection {
  public static void main(String[] args) {
    int number, index = 0;

    Item[] collection = new Item[5];
    Scanner input = new Scanner(System.in);
    String author, bookOrPeriodical, title;

    for (int i = 0; i < 5; i++) {
      System.out.println("Please enter B for Book or P for Periodical");
      bookOrPeriodical = input.nextLine();

      if (bookOrPeriodical.equals("B")) {
        System.out.println("Please enter the name of the Book");
        title = input.nextLine();

        System.out.println("Please enter the author of the Book");
        author = input.nextLine();

        System.out.println("Please enter the ISBN of the Book");
        number = input.nextInt();
        input.nextLine();

        collection[index] = new Book(title, author, number);
        index++;
      } else if (bookOrPeriodical.equals("P")) {
        System.out.println("Please enter the name of the Periodical");
        title = input.nextLine();

        System.out.println("Please enter the issue number");
        number = input.nextInt();
        input.nextLine();

        collection[index] = new Periodical(title, number);
        index++;
      }
    }

    System.out.println("Your Items:");
    for (Item item : collection) {
      System.out.println(item.getListing() + "\n");
    }
  }
}
