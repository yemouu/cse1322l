/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 4
*/

// 2021-09-13

public class Pokemon {
  private int level;
  private double baseCatchRate;

  public Pokemon(int level, double baseCatchRate) {
    this.level = level;
    this.baseCatchRate = baseCatchRate;
  }

  public int getLevel() {
    return level;
  }

  public double getBaseCatchRate() {
    return baseCatchRate;
  }
}
