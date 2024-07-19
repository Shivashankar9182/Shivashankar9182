//Demonstration of java program for finding duplicate values 
package com.apjfsa;
//class declaration
public class DuplicateArr {

	public static void main(String[] args) {
		//Assigning array elements
		int[] num= {1,1,23,4,4,5,5,67,45};
		int count=0;//variable to store count of duplicate values
		//printing Duplicate values
		System.out.println("Duplicate elements in the array:");
		//Nested loop to iterate through array
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				//check if current element is equal to any element in array
				if(num[i]==num[j]) {
					//printing the duplicate values
					System.out.println(num[j]+ "");
					count++;
				}
			}
		}
		System.out.println(count++);
	}
}
