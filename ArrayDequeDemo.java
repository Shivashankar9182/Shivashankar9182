//Demonstration of a program using Array Dequeue using String and demonstrate methods of Array Dequeue

package com.collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        // Create an ArrayDeque to store strings
        ArrayDeque<String> fruits = new ArrayDeque<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.addFirst("Mango");
        fruits.addLast("Orange");

        System.out.println(fruits);//prints fruit names

        // Accessing elements
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());
        System.out.println("popped:" +fruits.pop());
        System.out.println("peek element:" +fruits.peek());

        // Checking for elements
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));
        System.out.println("Is deque empty: " + fruits.isEmpty());
        System.out.println("Contains 'Guava': " + fruits.contains("Guava"));

        // Removing elements
        fruits.removeFirst();
        System.out.println("Deque after removing first element: " + fruits);

        fruits.pollLast();  // pollLast removes and returns, similar to removeLast but safer
        System.out.println("Deque after removing last element: " + fruits);

        // Iterating through elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
