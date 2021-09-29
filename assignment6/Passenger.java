/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 6
*/

// 2021-09-27
// 2021-09-28

public class Passenger {
	public String name;
	public int carryOnBags;
	public int checkedBags;

	public Passenger(String name, int carryOnBags, int checkedBags) {
		this.name = name;
		this.carryOnBags = carryOnBags;
		this.checkedBags = checkedBags;
	}

	@Override
	public String toString() {
		return name + " has " + carryOnBags + " carry on bags and "
		       + checkedBags + " checked bags";
	}
}
