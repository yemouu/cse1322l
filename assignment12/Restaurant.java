/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 12
*/

// 2021-11-13

import java.util.ArrayList;

public class Restaurant {
  public static ArrayList<Food> madeFood = new ArrayList<Food>();
  private ArrayList<Thread> workers = new ArrayList<Thread>();
  private ArrayList<Thread> customers = new ArrayList<Thread>();

  public void open() {
    for (int i = 0; i < 4; i++) workers.add(new Thread(new FryCook()));
    for (int i = 0; i < 3; i++) workers.add(new Thread(new BurgerCook()));
    for (Thread worker : workers) worker.start();
  }

  public void openDoors() {
    for (int i = 0; i < 100; i++) customers.add(new Thread(new Customer()));

    for (Thread customer : customers) {
      customer.start();

      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        System.out.println("Failed to sleep for 50ms: " + e.getMessage());
      }
    }
  }

  public void currentCookedFood() {
    int friesCount = 0;
    int burgerCount = 0;

    for (Food food : madeFood) {
      if (food instanceof Fries) friesCount++;
      else if (food instanceof Burger) burgerCount++;
    }

    System.out.println("Currently we have " + friesCount + " fries, and " + burgerCount + " burgers");
  }
}
