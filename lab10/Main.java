/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        10
*/

// 2021-10-22

import java.util.Scanner;

public class Main {
  public static String repeatNTimes(String string, int n) {
    if (n <= 0) return "";

    return string + repeatNTimes(string, n - 1);
  }

  public static boolean isReverse(String normalString, String reversedString) {
    if (normalString.length() != reversedString.length()) return false;
    if (normalString.length() == 0) return true;

    if (normalString.charAt(0) == reversedString.charAt(reversedString.length() - 1))
      return isReverse(
          normalString.substring(1, normalString.length()),
          reversedString.substring(0, reversedString.length() - 1));

    return false;
  }

  public static void main(String[] args) {
    String first, second;
    Scanner input = new Scanner(System.in);

    System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));

    System.out.println("Enter the first string");
    first = input.nextLine();

    System.out.println("Enter the second string");
    second = input.nextLine();

    if (isReverse(first, second)) System.out.println(first + " is the reverse of " + second);
    else System.out.println(first + " is not the reverse of " + second);
  }
}
