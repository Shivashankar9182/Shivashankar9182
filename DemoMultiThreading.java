package com.exe;

//1.defining a thread using thread class
class DemoThread extends Thread {
	String threadName;

	public DemoThread(String threadName) {
		super();
		this.threadName = threadName;
	}

	// running state
	public void run() {
		System.out.println("Name :" + this.getName());
		System.out.println("Priority :" + this.getPriority());
		try {
			this.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		System.out.println("ID :" + this.getId());
	}
}

public class DemoMultiThreading {

	public static void main(String[] args) {
		// 1.new thread
		DemoThread d = new DemoThread("Demo thread");
		// 2.runnable thread
		d.start();
		DemoThread d1 = new DemoThread("thread 1");
		// 2.runnable thread
		d1.start();
		DemoThread d2 = new DemoThread("thread 2");
		// runnable thread
		d2.start();

	}

}