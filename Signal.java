
package com.exe;

public class Signal {
	
	String signal;
	
	synchronized void green(String signal) throws InterruptedException{
		if(signal.compareToIgnoreCase("green")!=0)
			wait();
		System.out.println("The signal is green: now you can move");
		
	}
	synchronized void red(String signal) {
		System.out.println("The signal is red: wait for 1 min");
		
		signal="green";
		notify();
		
	}

}
