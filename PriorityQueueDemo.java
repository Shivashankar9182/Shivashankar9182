//Demonstration of a program using Priority Queue.
package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        // Create a PriorityQueue to store integers
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Adding elements
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        //prints numbers in sorted order
        System.out.println("PriorityQueue: " +numbers);
        
        System.out.println("Added element:" +numbers.add(4));

        // Accessing elements (peek doesn't remove)
        System.out.println("Highest priority element: " + numbers.peek());

        // Removing elements
        System.out.println("Removed element: " + numbers.poll());

        System.out.println("PriorityQueue after removing: " + numbers);

    }
}
