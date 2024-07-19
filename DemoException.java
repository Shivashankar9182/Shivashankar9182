package com.exe;
//Program on using nested try-catch block
import java.util.TreeSet;

public class DemoException {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,10};
		try {
			for(int i=0;i<5;i++) {
				System.out.println(arr[i]);
			}
			
			try {
			TreeSet<Integer> tset = new TreeSet<Integer>();
			tset.add(null);
			}catch(Exception e){
				System.out.println(e);	
			}
			
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Array Exception caught");
		}finally {
		}
			System.out.println("finally");
		}

}
