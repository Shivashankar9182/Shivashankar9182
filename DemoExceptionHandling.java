//Demonstration of a program for Exception handling using try, catch and finally for handling a Arithmetic Exception and Array Index Out of Bounds Exception
package com.exe;

public class DemoExceptionHandling {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};  // Array to demonstrate exceptions

        try {
            // Code that might throw exceptions
            int result = 10 / 0;  // Attempt to divide by zero (ArithmeticException)

            // Accessing element outside the array bounds (ArrayIndexOutOfBoundsException)
            System.out.println(numbers[4]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } finally {
            System.out.println("finally keyword prints regardless of exception");
        }
    }
}
