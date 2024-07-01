package com.apjfsa;

import java.util.Scanner;

public class Months {
	
	void Days(int d) {
		switch(d) {
		case 1:System.out.println("January has 31 days");
		break;
		case 2:System.out.println("Febrauary has 28 days(except leap year has 29 days");
		break;
		case 3:System.out.println("March has 31 days");
		break;
		case 4:System.out.println("April has 30 days");
		break;
		case 5:System.out.println("May has 31 days");
		break;
		case 6:System.out.println("june have 30 days");
		break;
		case 7:System.out.println("July hava 31 days");
		break;
		case 8:System.out.println("August have 31 days");
		break;
		case 9:System.out.println("September have 30 days");
		break;
		case 10:System.out.println("October have 31 days");
		break;
		case 11:System.out.println("November have 30 days");
		break;
		case 12:System.out.println("December have 31 days");
		break;
		default:System.out.println("invalid");
		break;
		}
	}
	

	public static void main(String[] args) {
         
		int num1;
		System.out.println("Enter a number(1-12):");
		Scanner scanner=new Scanner(System.in);
		num1=scanner.nextInt();
		
		Months da=new Months();
		System.out.println("No of days in a month:"); //
		da.Days(num1);
		
		
	}

}
