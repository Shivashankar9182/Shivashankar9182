//program to define a String object and demonstrate  multiple methods of String.
package com.apjfsa;

public class StringDemo {

	  public static void main(String[] args) {
		  //Defining a string object
	    String name="Java Programming";
	    System.out.println(name);

	    //String length
	    System.out.println("String Length:" +name.length());

	    //Accessing characters
	    char firstChar=name.charAt(0);
	    char lastChar=name.charAt(name.length()- 1);
	    System.out.println("First Character:"+firstChar);
	    System.out.println("Last Character:"+lastChar);

	    //Concatenation
	    String fullName=name +"Course";
	    System.out.println("Concatenated String:"+fullName);

	    //Replacing characters
	    String replacedString=name.replace("Java","Python");
	    System.out.println("Replaced String:" +replacedString);

	    //Converting to lowercase / uppercase
	    String lowerCase=name.toLowerCase();
	    String upperCase=name.toUpperCase();
	    System.out.println("Lowercase:" +lowerCase);
	    System.out.println("Uppercase:" +upperCase);
	    
	    //Searching for index number of string name
	    System.out.println("IndexNo of n:" +name.indexOf('n'));
		System.out.println("IndexNo:" +name.lastIndexOf(0));
		System.out.println("IndexNo of a:" +name.indexOf('a',2));
		
	   //if string is empty its gets true value else false
		System.out.println("Empty String:" +name.isEmpty());
		
	    
	  }
	}
