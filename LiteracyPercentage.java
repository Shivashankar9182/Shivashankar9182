//Demonstration of a program using Stack to store Cities based on literacy and retrieve the top city,and search a city place in list.
package com.collection;

import java.util.Stack;

public class LiteracyPercentage {

	public static void main(String[] args) {
		
		//Creating a Stack to store city name
		Stack<String> cities=new Stack<String>();
		cities.add("Telangana");//83.26
		cities.add("Andhra Pradesh");//86.21
		cities.add("Delhi");//87.67
		cities.add("Tamilnadu");//89.73
		cities.add("Kerala");//90.23
		
		System.out.println(cities);//prints all the cities in the stack
		System.out.println("Top literacy city is : " +cities.peek());//to check the city with highest literacy rate
		//searching for a city index no
		System.out.println(cities.search("Delhi"));
		System.out.println(cities.search("Telangana"));	
		
	}

}
