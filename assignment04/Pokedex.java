/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 4
*/

// 2021-09-13
// 2021-09-17

import java.util.ArrayList;

public class Pokedex {
  private ArrayList<Pokemon> myPokedex = new ArrayList<Pokemon>();

  public void addToDex(Pokemon pokemon) {
    myPokedex.add(pokemon);
  }

  @Override
  public String toString() {
    String returnString = "";

    for (Pokemon pokemon : myPokedex) {
      returnString += pokemon + "\n";
    }

    return returnString;
  }
}
