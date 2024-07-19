//Demonstration of a program on String Buffer
package com.apjfsa;

public class DemoStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer strbuff=new StringBuffer("Avanthi PG ");
		System.out.println(strbuff);
		//Append 'college' to the existing
		strbuff.append("College");
		System.out.println(strbuff);
		//reverse the string
		System.out.println("Reverse of given string:"+strbuff.reverse());
		
		System.out.println("\nCharacter at index number 9:" +strbuff.charAt(9));
		System.out.println("Index number of G:" +strbuff.indexOf("G"));//gives index no of string
		System.out.println("Capcity of String:" +strbuff.capacity());//Gives capacity of string to store values
		
		//create another string buffer with a different name
		StringBuffer strb=new StringBuffer("Master of Computer Application");
		
		System.out.println("\n" +strb);
		System.out.println("Insert 'Course' value at 0 index number:"  +strb.insert(0 ,"Course-"));//inserts value at 0 index no

		System.out.println("\nCapacity of string:" +strb.capacity());//capacity of new string 
		System.out.println("Unicode of String:" +strb.codePointAt(0));//Gets the unicode value of first character
		
		System.out.println("\nLength of String:" +strb.length());//gets length of the string
		strb.deleteCharAt(10);
		System.out.println("\nDeleted charcter at index 10 is:" +strb);//Deletes the character  at index 10
		System.out.println("Reverse of String:" +strb.reverse());//reverse the string value
	}

}
