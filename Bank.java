//Demonstration  of  break statement for the ATM application to break the loop whenever daily limit exceeds for Withdrawal.

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int Accountbalance=120000;//Initial balance in the Account
		int withdrawAmount,sumAmount=0,depositAmount;
		Scanner scanner=new Scanner(System.in);
		
		//Options on the screen ATM menu
		while(true){
			System.out.println("\nATM Menu:");
			System.out.println("1. WithDraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter amount to withdraw:");
			int withdrawAmount1=scanner.nextInt();
			
			if(withdrawAmount1>500000) {
			if(withdrawAmount1<=Accountbalance){
				Accountbalance -=withdrawAmount1; //Account balance get deducted from our bank
				System.out.println("Withdrawn successfull.please collect your cash.");
			}
			else {
				System.out.println("Insufficient Balance");
			}
			}
			else {
				System.out.println("Dialy Limit exceeded for todays transcations");
			}
			
			break;
			case 2:System.out.println("Enter Amount to Deposit:" +Accountbalance);
			int depositAmount1=scanner.nextInt();
			Accountbalance +=depositAmount1; //Account balance s added to your account
			System.out.println("Amount Deposited Successfully:" );
			break;
			case 3:
				System.out.println("Your current balance is:" +Accountbalance);
				break;
			case 4:System.out.println("Exiting ATM");
			System.exit(0);
			default:System.out.println("service unavailable");
			}
		}
	}
}

		
			
		