//Demonstration of a program using Tree set to insert Country names.
package com.collection;

import java.util.TreeSet;

public class CountryTreeSet {

  public static void main(String[] args) {

    // Create a TreeSet to store countries in alphabetical order 
    TreeSet<String> countries = new TreeSet<>();

    // Add countries to the set
    countries.add("India");
    countries.add("France");
    countries.add("Brazil");
    countries.add("China");
    countries.add("Australia");

    // Print the sorted countries
    System.out.println("Countries: " + countries);

    // Retrieve the first and last country (TreeSet maintains sorted order)
    String firstCountry = countries.first();
    String lastCountry = countries.last();
    System.out.println("\nFirst country: " + firstCountry);
    System.out.println("Last country: " + lastCountry);
  }
}
