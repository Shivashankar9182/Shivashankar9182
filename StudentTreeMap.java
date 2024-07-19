//Demonstration of a program using Tree Map for inserting the student objects with the roll number as key.
package com.collection;

import java.util.TreeMap;

public class StudentTreeMap {

	public static void main(String[] args) {
		// Create a Tree Map to store student data
		TreeMap<Integer,String> student = new TreeMap<Integer,String>();
		// adding students rollno and name
		student.put(97,"Shiva");
		student.put(91,"Azhar");
		student.put(110,"Arun");
		student.put(95,"Vijay");
		student.put(105,"Giri");
		
		// prints all students
		System.out.println(student);
		
		// Check if a specific student exists by roll number
		System.out.println(student.containsKey(97));
		// Retrieve the name of the student with roll number 97		
		System.out.println(student.get(97));
		// Remove the student with roll number 95
		System.out.println(student.remove(95));
		// Print only the names of all students values
		System.out.println(student.values());
		// Prints remaining students 
		System.out.println(student);
		// Remove and print the student with the highest roll number
		System.out.println(student.pollLastEntry());
		// Remove and print the student with the lowest roll number
		System.out.println(student.pollFirstEntry());
		// Print all remaining students
		System.out.println(student);	
	}

}
