/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        13
*/

// 2021-11-12

import java.util.Random;

public class Baby implements Runnable {
  private int time;
  private String name;

  public Baby(String name) {
    this.name = name;

    Random rand = new Random();
    this.time = rand.nextInt(5000);
  }

  public void run() {
    System.out.println("My name is " + name + " and I am going to sleep for " + time + "ms");

    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      System.out.println("Failed to sleep: " + e.getMessage());
    }

    System.out.println("My name is " + name + ", I am awake, feed me!!!");
  }
}
