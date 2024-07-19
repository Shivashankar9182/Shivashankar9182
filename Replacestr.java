/*Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is
"12345678", the return value should be "XXXX5678".*/
package com.apjfsa;

import java.util.Scanner;

public class Replacestr {
	
	// This method replaces all characters except the last 4 in a string with 'X'
	String replaceStr(String s) {
		//convert the string to a char arrray
		char arr[]=new char[s.length()];
		arr=s.toCharArray();
		
		//Replace all characters except the last 4 with 'X'
		for(int i=0;i<arr.length-4;i++) {
			arr[i]='x';
		}
		String str1=new String(arr);
		return str1;
	}
	  
	  public static void main(String[] args) {
		  
		  System.out.println("Enter your phone number:");
		  
		  Scanner sc=new Scanner(System.in);
		  String str=sc.next();
		
		  Replacestr rp=new Replacestr();
		  System.out.println(rp.replaceStr(str));
		  
	}
}
