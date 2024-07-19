package com.apjfsa;

public class MinandMax {

	public static void main(String[] args) {
		//initializing array values
		int arr[]= {12,21,6,35,78};
		int i,min,max;
		//assigning first value of array to min to check 
		min=arr[0];
		//assigning first value of array to max to check 
		max=arr[0];
		//loop to check the minimum and maximum number
		for(i=0;i<arr.length;i++) {
			//condition to check the elements of the array
			if(arr[i]<min) {
				//checking minimum value
				min=arr[i];
			}
			if(arr[i]>max) {
				//checking maximum value
				max=arr[i];
			}
		}
		
		//printing the max and min values of the array
		System.out.println("The minimum number: "+min);
		System.out.println("The Maximum number: "+max);
		
		
	}

}
