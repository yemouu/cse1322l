/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        5
*/

// 2021-09-10

public abstract class Item {
  private String title;

  public Item() {
    title = "";
  }

  public Item(String title) {
    this.title = title;
  }

  public abstract String getListing();

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
