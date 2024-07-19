//Demonstration of program for merging two arrays
package com.apjfsa;
//main class
public class MergingArray {
	//main function
	public static void main(String[] args) {
		//Declare and initialize of two integers
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9};
		//Declaring arr3 to store Merge elements 
		int arr3[]=new int[arr1.length+arr2.length];
		//to copy elements in arr1 to arr3
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		//to copy elements in arr2 to arr3
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		//loop to print elements in arr3
		for(int i=0;i<arr3.length;i++) {
			int num=arr3[i];//get element from arr3 at index i
			System.out.println(num+ " ");
		}
	}
}