//Demonstration of a program to count the number of vowels in a given String
package com.apjfsa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VowelConsonantCount {

	public static void main(String[] args) {
		
		int vCount = 0;
		int cCount=0;
		int wordcount=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a character:");
		
		String alpha=sc.nextLine();
		alpha=alpha.toLowerCase();
		
		StringTokenizer token=new StringTokenizer(alpha," ");
		
		wordcount=token.countTokens();
		
		
		for(int i=0;i<alpha.length();i++) {
			if(alpha.charAt(i)=='a' || alpha.charAt(i)=='e'||alpha.charAt(i)=='i'||alpha.charAt(i)=='o'||alpha.charAt(i)=='u') {
				vCount++;	
			}
			else if(alpha.charAt(i)>='a' && alpha.charAt(i)<='z') 
				{
				cCount++;
			}
			
		}
			System.out.println("no of vowel is:"+vCount);
			System.out.println("no of consonants is:"+cCount);
			System.out.println("no of words:" +wordcount);
		
		
	}

}
