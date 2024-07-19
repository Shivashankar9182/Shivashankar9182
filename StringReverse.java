//Demonstration of a program to reverse a given string value(using string)
package com.apjfsa;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		//read user input
		String name=sc.nextLine();
		
		
		//Initialize an empty string to store the reversed string
		String reverse="";
		//Iterate through each character in input string
		for(int i=0;i<name.length();i++) {
			//append the current character to reverse string
			reverse=name.charAt(i)+reverse;
		}
		//printing the values
		System.out.println("Reversed string:"+reverse);
	}

}
