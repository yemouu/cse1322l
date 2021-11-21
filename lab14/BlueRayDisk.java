/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        14
*/

// 2021-11-21

public class BlueRayDisk {
  public String title;
  public String director;
  public int yearOfRelease;
  public double cost;

  public BlueRayDisk(String title, String director, int yearOfRelease, double cost) {
    this.title = title;
    this.director = director;
    this.yearOfRelease = yearOfRelease;
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "$" + cost + " " + yearOfRelease + " " + title + ", " + director;
  }
}
