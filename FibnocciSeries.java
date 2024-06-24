//Demnstration of FibonacciSeries

package com.apjfsa;

public class FibnocciSeries {

	public static void main(String[] args) {
		
		int i,num1=0,num2=1,num3,range=10;
		System.out.println(num1+ "" +num2);
		for(i=2;i<range;i++)
		{
			num3=num1+num2; //it give values 0+1=1,1+1=2,2+3=5,3+5=8,5+8=13,8+13=21
			System.out.println("" +num3);
			num1=num2;
			num2=num3;
		}
			

	}

}
