/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        2
*/

// 2021-08-24

public class StockItem {
  private String description;
  private int id;
  private float price;
  private int quantity;

  private static int uid;

  public StockItem() {
    id = uid++;
  }

  public StockItem(String description, float price, int quantity) {
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    id = uid++;
  }

  public String getDescription() {
    return description;
  }

  public int getId() {
    return id;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setPrice(float price) {
    if (price >= 0.0) this.price = price;
    else System.err.println("Price is below zero... doing nothing");
  }

  public void lowerQuantity(int quantity) {
    if ((this.quantity - quantity) >= 0) this.quantity -= quantity;
    else System.err.println("Quantity is below zero... doing nothing");
  }

  public void raiseQuantity(int quantity) {
    this.quantity += quantity;
  }

  @Override
  public String toString() {
    return "Item number: "
        + id
        + " is "
        + description
        + " has"
        + String.format(" %.2f ", price)
        + "we currently have "
        + quantity
        + " in stock";
  }
}
