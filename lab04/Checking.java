/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        4
*/

// 2021-09-08

public class Checking extends Account {
  public Checking() {
    super();
  }

  public Checking(double account_balance) {
    super(account_balance);
  }

  @Override
  public void withdrawl(double amount) {
    double new_balance = get_account_balance() - amount;

    if (new_balance < 0) {
      System.out.println("Charging an overdraft fee of $20 because account is " + "below $0.");
      new_balance -= 20;
    }

    set_account_balance(new_balance);
  }
}
