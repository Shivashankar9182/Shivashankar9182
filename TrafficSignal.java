package com.exe;

public class TrafficSignal {

	public static void main(String[] args) {
		
		Signal sig=new Signal();
		
		Thread thread=new Thread() {
		
		public void run() {
			try {
				sig.green("red");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	thread.start();
	
	Thread thread1=new Thread() {
		public void run() {
			sig.red("green");
		}
		};
		thread1.start();	
	}

}
