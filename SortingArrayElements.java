//Demonstration of program Sorting Elements in Ascending order
package com.apjfsa;

public class SortingArrayElements {

  public static void main(String[] args) {

    // Array to be sorted
    int[] arr = {23, 45, 69, 4, 3};

    // Outer loop controls the number of passes required for sorting
    for (int i = 0; i < arr.length - 1; i++) {
      // Inner loop compares adjacent elements and swaps them if necessary
      for (int j = 0; j < arr.length - i - 1; j++) {
        // Check if elements are in the wrong order (descending order here)
        if (arr[j] > arr[j + 1]) {
          // Swap elements using a temporary variable
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // Print the sorted array
    System.out.println("Sorted Elements (ascending order):");
    for (int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+ " ");  
    }
  }
}
