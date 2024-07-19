package com.apjfsa;

import java.util.Scanner;

public class StuResult {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Read total marks
        System.out.print("Enter total marks: ");
        int marks = sc.nextInt();

        boolean passed = true;

        // Check if marks are less than or equal to 35
        if (marks >= 35) {
            passed = true;
        }

        if (passed) {
            double percentage = marks / 6.0; // Use double for division accuracy
            System.out.println("RESULT:");
            System.out.println("Pass\npercentage=" + percentage);
        } else {
            System.out.println("Fail");
        }
    }
}
