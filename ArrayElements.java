package com.exe;

import java.io.InterruptedIOException;

public class ArrayElements {
	
	int[] arr;
	
	public ArrayElements(int[] arr) {
		super();
		this.arr = arr;
	}
	// Synchronized method to calculate the sum of array elements
	synchronized void sumOfElements() throws InterruptedException {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			Thread.sleep(500);
			System.out.println(arr[i]);
		}
		System.out.println("Sum:"+sum);	
	}

}

