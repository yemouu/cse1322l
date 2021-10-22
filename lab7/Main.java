/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        7
*/

// 2021-09-19

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float a, b;
    int selection;

    Scanner input = new Scanner(System.in);

    Calculator calc = new Calculator();

    a = b = 0;
    do {
      System.out.println(
          "0 - Exit\n"
              + "1 - Addition\n"
              + "2 - Subtraction\n"
              + "3 - Multiplication\n"
              + "4 - Division\n"
              + "Please Choose an Option: ");

      selection = input.nextInt();
      if (selection == 0) break;

      System.out.println("Please enter the first number ");
      a = input.nextFloat();

      System.out.println("Please enter the second number ");
      b = input.nextFloat();

      switch (selection) {
        case 1:
          System.out.println(calc.add(a, b));
          break;
        case 2:
          System.out.println(calc.subtract(a, b));
          break;
        case 3:
          System.out.println(calc.multiply(a, b));
          break;
        case 4:
          System.out.println(calc.divide(a, b));
          break;
      }
    } while (true);
  }
}
