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

public class Caterpie extends Pokemon {
	public Caterpie(int level) {
		// Rubric states 0.2 but instructions states 0.5 as the baseCatchRate
		super(level, 0.5);
	}

	@Override
	public String toString() {
		return "A level " + getLevel() + " Caterpie";
	}
}
