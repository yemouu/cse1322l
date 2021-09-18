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

public class Bulbasaur extends Pokemon {
	public Bulbasaur(int level) {
		super(level, 0.2);
	}

	@Override
	public String toString() {
		return "A level " + getLevel() + " Bulbasaur";
	}
}
