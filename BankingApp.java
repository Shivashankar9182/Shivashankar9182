// Developing a Banking Application using Custom Exception - Insufficient Fund when Amount is not available to withdraw.

package com.exe;

 //This class represents a custom exception thrown when there are insufficient funds in an account.
 
class InsufficientBalanceException extends Exception {

    // Exception message
    String msg;

    //Constructor to initialize the exception message
     
    public InsufficientBalanceException(String msg) {
        super(msg);
        this.msg = msg;
    }
}

 //This class represents a basic banking application simulating an account.
 
public class BankingApp {

    // Account number for the bank account
    int accNo;

    // Current balance in the bank account
    int balance;

    // Minimum balance required to be maintained in the account
    int min_balance = 1000; 

    //Constructor to initialize the bank account with account number and balance
     
    public BankingApp(int accNo, int balance) {
        super();
        this.accNo = accNo;
        this.balance = balance;
    }

    //Deposits the specified amount into the account and prints the new balance
    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited: " + amt + " New Balance: " + balance);
    }

   
    void withdraw(int amt) throws InsufficientBalanceException {
        if (balance >= amt + min_balance) {
            balance -= amt;
            System.out.println("Amount withdrawn successfully. Withdrawn: " + amt + " Remaining balance: " + balance);
        } else {
            throw new InsufficientBalanceException("Insufficient Balance to maintain minimum required balance of " + min_balance);
        }
    }

    //Creates a BankingApp object, deposits and attempts to withdraw funds
     
    public static void main(String[] args) throws InsufficientBalanceException {
        BankingApp ba = new BankingApp(465267720, 300000);
        ba.deposit(10000);
        try {
            ba.withdraw(300000);
        } catch (InsufficientBalanceException ie) {
            System.out.println(ie);
        }
    }
}
