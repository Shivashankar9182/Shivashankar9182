package com.exe;

class DThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread Name:" +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		DThread dthread=new DThread();
		
		Thread t=new Thread(dthread,"Demo One");
		t.start();
		
	}

}
