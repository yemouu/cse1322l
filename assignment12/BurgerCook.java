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

public class BurgerCook extends Restaurant implements Runnable {
  private int id;
  private static int nextBurgerCookID = 1;

  public BurgerCook() {
    id = nextBurgerCookID++;
  }

  public void run() {
    Random rand = new Random();
    System.out.println("Burger cooker #" + id + " is starting to cook");

    for (int i = 0; i < 50; i++) {
      System.out.println("Burger cooker #" + id + " cooked a burger");
      super.madeFood.add(new Burger());

      try {
        Thread.sleep(rand.nextInt(1000));
      } catch (InterruptedException e) {
        System.out.println("Failed to sleep: " + e.getMessage());
      }
    }
  }
}
