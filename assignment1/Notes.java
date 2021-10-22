/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 1
*/

// 2021-08-24

public class Notes {
  private int quantityOnHand;
  private int denomination;

  public Notes(int denomination) {
    this.denomination = denomination;
  }

  public int getTotalValue() {
    return denomination * quantityOnHand;
  }

  public void increaseQuantity(int quantity) {
    quantityOnHand += quantity;
  }

  public void decreaseQuantity(int quantity) {
    // Make sure quantityOnHand is never zero
    int tempQuantity = quantityOnHand - quantity;
    if (tempQuantity >= 0) quantityOnHand = tempQuantity;
    else quantityOnHand = 0;
  }

  public int getQuantityOnHand() {
    return quantityOnHand;
  }

  public String printPretty(float amount) {
    return "$" + String.format("%4.2f", amount);
  }

  @Override
  public String toString() {
    return printPretty(getTotalValue()) + " in " + printPretty(denomination) + " notes";
  }
}
