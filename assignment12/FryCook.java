/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 12
*/

// 2021-11-13

import java.util.Random;

public class FryCook extends Restaurant implements Runnable {
  private int id;
  private static int nextFryCookID = 1;

  public FryCook() {
    id = nextFryCookID++;
  }

  public void run() {
    Random rand = new Random();
    System.out.println("Fry cooker #" + id + " is starting to cook");

    for (int i = 0; i < 50; i++) {
      System.out.println("Fry cooker #" + id + " cooked fries");
      super.madeFood.add(new Fries());

      try {
        Thread.sleep(rand.nextInt(1000));
      } catch (InterruptedException e) {
        System.out.println("Failed to sleep: " + e.getMessage());
      }
    }
  }
}
