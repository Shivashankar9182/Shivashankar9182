package com.exe;

public class DemoClassCastExe {

	public static void main(String[] args) {
		
		int a=105;
		int b=a;
		
		float c=b;
		char ch=(char) a;
		
		Object obj=new Object();
		
		String s=(String) obj;
		System.out.println(s);
		
	}

}
