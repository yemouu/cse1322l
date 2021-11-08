/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 11
*/

// 2021-11-07

import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String fileName;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a filename:");
    fileName = input.nextLine();

    try {
      File file = new File(fileName);

      char[] chars;
      int lineCount, wordCount, charCount;
      lineCount = wordCount = charCount = 0;

      String line;
      String[] words;

      Scanner scan = new Scanner(file);

      while (scan.hasNextLine()) {
        scan.nextLine();
        lineCount++;
      }

      scan = new Scanner(file);

      while (scan.hasNextLine()) {
        line = scan.nextLine();
        words = line.split(" ");
        wordCount += words.length;
      }

      scan = new Scanner(file);

      while (scan.hasNextLine()) {
        line = scan.nextLine();
        chars = line.toCharArray();

        for (char c : chars) {
          if (c == ' ' || c == '.' || c == ',') continue;
          charCount++;
        }
      }

      System.out.println("Lines: " + lineCount + "\nWords: " + wordCount + "\nChars: " + charCount);
    } catch (IOException e) {
      System.out.println("File error: " + e.getMessage());
    }
  }
}
