/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 1
*/

// 2021-08-24

public class Coins {
	private int quantityOnHand;
	private float denomination;
	private float weight;

	public Coins(float denomination, float weight) {
		this.denomination = denomination;
		this.weight = weight;
	}

	public float getTotalWeight() {
		return weight * quantityOnHand;
	}

	public float getTotalValue() {
		return denomination * quantityOnHand;
	}

	public void increaseQuantity(int quantity) {
		quantityOnHand += quantity;
	}

	public void decreaseQuantity(int quantity) {
		// Doing it this way ensures that quantityOnHand is never under zero
		int tempQuantity = quantityOnHand - quantity;
		if (tempQuantity >= 0)
			quantityOnHand = tempQuantity;
		else
			quantityOnHand = 0;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public String printPretty(float amount) {
		return "$" + String.format("%4.2f", amount);
	}

	@Override
	public String toString() {
		return printPretty(getTotalValue()) + " in "
		       + printPretty(denomination) + " coins";
	}
}
