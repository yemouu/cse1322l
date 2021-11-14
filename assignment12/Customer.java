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

public class Customer extends Restaurant implements Runnable {
  private int id;
  private static int nextCustomerID = 0;

  public Customer() {
    id = ++nextCustomerID;
  }

  public void eatBurger() {
    System.out.println("Customer " + id + " wants a burger");

    for (int i = 0; i < super.madeFood.size(); i++) {
      if (super.madeFood.get(i) instanceof Burger) {
        super.madeFood.remove(i);
        return;
      }
    }

    System.out.println("Oh on, we are out of Burgers!!!");
  }

  public void eatFries() {
    System.out.println("Customer " + id + " wants fries");

    for (int i = 0; i < super.madeFood.size(); i++) {
      if (super.madeFood.get(i) instanceof Fries) {
        super.madeFood.remove(i);
        return;
      }
    }

    System.out.println("Oh on, we are out of Fries!!!");
  }

  public void run() {
    Random rand = new Random();

    try {
      Thread.sleep(rand.nextInt(1000) + 2000);
    } catch (InterruptedException e) {
      System.out.println("Failed to sleep: " + e.getMessage());
    }

    switch (rand.nextInt(3)) {
      case 0:
        eatBurger();
        break;
      case 1:
        eatBurger();
        eatFries();
        break;
      case 2:
        eatFries();
        break;
    }
  }
}
