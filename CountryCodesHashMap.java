//Demonstration of a program using  Hash Map insert Country with its codes as key.
package com.collection;

import java.util.HashMap;

public class CountryCodesHashMap {

  public static void main(String[] args) {
    // Create a HashMap to store countries with their  codes 
    HashMap<String, Integer> countries = new HashMap<>();

    // Adding some countries and their corresponding dialing codes
    countries.put("India", 91);  
    countries.put("USA", 1);       
    countries.put("Russia", 7);
    countries.put("England", 44);
    countries.put("France", 33);

    // prints the countries and their country code
    System.out.println(countries);

    // Print only the  countrycodes values
    System.out.println("List of dialing codes: " + countries.values());

    // Print only the country names 
    System.out.println("List of countries: " + countries.keySet());

    // Check if a specific country exists 
    System.out.println(countries.containsKey("India"));

    // Retrieve the dialing code for a specific country 
    System.out.println(countries.get("Russia"));
  }
}
