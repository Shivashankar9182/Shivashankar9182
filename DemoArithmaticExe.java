package com.exe;

public class DemoArithmaticExe {

	public static void main(String[] args) {
		
		int a,b,c;
		a=10;
		b=0;
		System.out.println("start of the program");
		
		try {
			c=a/b;
			System.out.println("c=" +c);
			int arr[]= {1,2,3};
			System.out.println(arr[4]);
			
		}catch(ArithmeticException ae) {
			System.out.println("Exception caught");
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Array Exception caught");
		}
		
			System.out.println("End of prg");
	}

}
