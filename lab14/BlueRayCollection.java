/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        14
*/

public class BlueRayCollection {
  private Node head;

  public BlueRayCollection() {
    head = null;
  }

  public void add(String title, String director, int yearOfRelease, double cost) {
    Node newNode = new Node();
    newNode.data = new BlueRayDisk(title, director, yearOfRelease, cost);

    Node current = head;

    try {
      while (current.next != null) current = current.next;
    } catch (NullPointerException e) {
      head = newNode;
      return;
    }

    current.next = newNode;
  }

  public void show_all() {
    Node current = head;

    while (current.next != null) {
      System.out.println(current.data);
      current = current.next;
    }

    System.out.println(current.data);
  }
}
