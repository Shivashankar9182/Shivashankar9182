//Demostration of a program to calculate Factorial of a number using a method which will allow one thread for executing at a time.
// package com.apjfsa;

class FactSync {

    // This variable stores the number for which the factorial will be calculated.
    int number;

    // This variable stores the factorial result, initialized to 1 for the base case.
    int fact = 1;

    // Constructor that takes a number as input and assigns it to the 'number' variable.
    public FactSync(int number) {
        this.number = number;
    }

    // This method calculates the factorial of the 'number' variable in a synchronized manner.
    synchronized void cal() {
        for (int i = 1; i <= number; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
			// Calculate the factorial by multiplying the current 'fact' with the loop 'i'.
            fact *= i;
        }

        // Prints the calculated factorial after the loop completes.
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

public class FactorialNum extends Thread {

    // This variable stores a reference to the FactSync object.
    FactSync fs;

    // Constructor that takes a FactSync object as input and assigns it to the 'fs' variable.
    public FactorialNum(FactSync fs) {
        this.fs = fs;
    }

    // This method overrides the run() method inherited from Thread.
    // It calls the cal() method of the associated FactSync object.
    public void run() {
        fs.cal();
    }

    public static void main(String[] args) {
        // Creating two FactSync objects calculating the factorial of numbers.
        FactSync fs1 = new FactSync(6);
        FactSync fs2 = new FactSync(4);

        // Create two FactorialNum objects, each associated with a corresponding FactSync object.
        FactorialNum fn1 = new FactorialNum(fs1);
		fn1.start();// Start the threads to run the cal() methods concurrently.

        FactorialNum fn2 = new FactorialNum(fs2);
		fn2.start();// Start the threads to run the cal() methods concurrently.


    }
}
