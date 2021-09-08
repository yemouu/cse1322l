/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        4
*/

// 2021-09-08

public class Account {
	private static int uid = 10000;

	private int account_number;
	private double account_balance;

	public Account() {
		account_number = ++uid;
		account_balance = 0;
	}

	public Account(double account_balance) {
		account_number = ++uid;
		this.account_balance = account_balance;
	}

	public int get_account_number() {
		return account_number;
	}

	public double get_account_balance() {
		return account_balance;
	}

	public void set_account_balance(double account_balance) {
		this.account_balance = account_balance;
	}

	public void withdrawl(double amount) {
		this.account_balance -= amount;
	}

	public void deposit(double amount) {
		this.account_balance += amount;
	}
}
