package com.exe;

public class DemoThrow {
		
		void divide(int a,int b) throws ArithmeticException{
			if(b==0)
				throw new ArithmeticException();
			int c=a/b;
			System.out.println("a/b:"+c);
			}
		/*char(String s,int a) {
			if(a>=s.length())
				throw new StringIndexOutOfBoundsException();
			
			return s.charAt(a);
			
		}*/
public static void main(String[] args) {
	
	DemoThrow demo=new DemoThrow();
	try {
		demo.divide(19, 0);
		//char ch =demo.charStr("Anudip",3);
		
	}catch(ArithmeticException ae){
		System.out.println(ae);
	}
		
	}
}
