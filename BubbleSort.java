//Demonstration of Bubble Sort program
package com.apjfsa;

public class BubbleSort {
	public static void main(String[] args) {
	   int[] arr={9,3,2,22,11,10};//declaring and initializing array
	   //outer loop
		  for(int i=0;i<arr.length-1;i++) {
			  //inner loop
	       for(int j=0;j<arr.length-i-1;j++) {
	    	   //checks the condition if it is greater than next element
		      if(arr[j] > arr[j + 1]) {
		    	  //Swapping elements
		          int temp = arr[j];
		          arr[j]=arr[j + 1];
		          arr[j+1]=temp;
		        }
		      }
		    }
		  //printing the sorted array
		    System.out.print("Sorted array: ");
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		  }
}
