/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 12
*/

// 2021-11-13

public class Main {
  public static void main(String[] args) {
    Restaurant stingers = new Restaurant();

    System.out.println("We are open!");
    stingers.open();
    stingers.openDoors();
    for (int i = 0; i < 10; i++) {

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Failed to sleep: " + e.getMessage());
      }

      stingers.currentCookedFood();
    }
    System.out.println("We are closed");
  }
}
