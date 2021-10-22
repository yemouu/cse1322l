/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        4
*/

// 2021-09-08

public class Savings extends Account {
  private int deposit_number = 1;

  public Savings() {
    super();
  }

  public Savings(double account_balance) {
    super(account_balance);
  }

  @Override
  public void withdrawl(double amount) {
    double new_balance = get_account_balance() - amount;

    if (new_balance < 500) {
      System.out.println("Charging a fee of $10 because you are below $500");
      new_balance -= 10;
    }

    set_account_balance(new_balance);
  }

  @Override
  public void deposit(double amount) {
    double new_balance = get_account_balance() + amount;

    System.out.println("This is deposit " + deposit_number + " to this account.");
    if (deposit_number >= 6) {
      System.out.println("Charging a fee of $10");
      new_balance -= 10;
    }

    set_account_balance(new_balance);
    deposit_number++;
  }

  public void add_interest() {
    double interest_amount = get_account_balance() * 0.015;

    System.out.println("Customer earned " + interest_amount + " in interest");
    set_account_balance(get_account_balance() + interest_amount);
  }
}
