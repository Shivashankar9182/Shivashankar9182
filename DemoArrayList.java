//Program to demonstrating Array List for inserting integer values and retrieve it, get index and get the last index of methods.
package com.collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        // Create an ArrayList 
        List<Object> list = new ArrayList<>();

        // Add elements to the list 
        list.add(10);  // Integer
        list.add(20);  // Integer
        list.add(30);  // Integer
        list.add('a');  // Character
        list.add(3.14); // Double
        list.add("java"); // String
        System.out.println("List elements: " + list);  

        // Insert an element at a specific index 
        list.add(1, 2);  // Insert 2 at index 1
        System.out.println("List after insertion: " + list);  
        // Modify an element at a specific index
        list.set(2, 4);  // Change element at index 2 to 4
        System.out.println("List after modification: " + list);  

        // Find the index of an element
        int indexOfA = list.indexOf('a');
        System.out.println("Index of 'a': " + indexOfA);  

        // Check if the list contains a specific element
        boolean containsOne = list.contains(1);
        System.out.println("List contains 1? " + containsOne); 

        // Get the element at a specific index
        Object firstElement = list.get(0);
        System.out.println("First element: " +firstElement); 

        // Find the last occurrence of an element 
        int lastIndexOfTwenty = list.lastIndexOf(20);
        System.out.println("Last index of 20: " + lastIndexOfTwenty); 
  
        // Get the size of the list (number of elements)
        int listSize = list.size();
        System.out.println("List size: " + listSize);  
    }
}
