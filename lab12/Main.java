/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        12
*/

// 2021-11-07

import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int lineNum = 1;

    String fileNameA, fileNameB, lineA, lineB;
    Scanner input = new Scanner(System.in);

    System.out.println("Name of first file:");
    fileNameA = input.nextLine();

    System.out.println("Name of second file:");
    fileNameB = input.nextLine();

    try {
      File fileA = new File(fileNameA);
      File fileB = new File(fileNameB);
      Scanner scanA = new Scanner(fileA);
      Scanner scanB = new Scanner(fileB);

      while (scanA.hasNextLine() || scanB.hasNextLine()) {
        if (scanA.hasNextLine()) lineA = scanA.nextLine();
        else lineA = "";

        if (scanB.hasNextLine()) lineB = scanB.nextLine();
        else lineB = "";

        if (!lineA.equals(lineB))
          System.out.println("Line " + lineNum + "\n" + "< " + lineA + "\n> " + lineB);

        lineNum++;
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
