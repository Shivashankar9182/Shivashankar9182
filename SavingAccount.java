package com.apjfsa;

public class SavingAccount extends Account {
	public SavingAccount(double balance, String accountnumber) {
		super(balance, accountnumber);
	}

	double InterestRate;

	public SavingAccount(double balance, String accountnumber, double interestRate) {
		super(balance, accountnumber);
		InterestRate = interestRate;
	}
	double calculateInterest() {
		return balance*InterestRate;
	}
	void withdraw(double amount) {
		super.withdraw(amount);
		
	}
	

}
