/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        13
*/

// 2021-11-12

public class Main {
  public static void main(String[] args) {
    Thread b1 = new Thread(new Baby("Noah"));
    Thread b2 = new Thread(new Baby("Olivia"));
    Thread b3 = new Thread(new Baby("Liam"));
    Thread b4 = new Thread(new Baby("Emma"));
    Thread b5 = new Thread(new Baby("Amelia"));

    b1.start();
    b2.start();
    b3.start();
    b4.start();
    b5.start();
  }
}
