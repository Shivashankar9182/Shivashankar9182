package com.exe;

public class SynchronizationDemo extends Thread {

	ArrayElements ae;

	public SynchronizationDemo(ArrayElements ae) {
		super();
		this.ae = ae;
	}
	// The run method is executed when the thread starts
	public void run() {
		try {
			ae.sumOfElements();// Call the synchronized method from ArrayElements
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-------");
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 8 };

		ArrayElements arre = new ArrayElements(arr);
		// Create three threads using the same ArrayElements instance
		SynchronizationDemo sch = new SynchronizationDemo(arre);
		sch.start();
		SynchronizationDemo sch1 = new SynchronizationDemo(arre);
		sch1.start();
		SynchronizationDemo sch2 = new SynchronizationDemo(arre);
		sch2.start();

	}

}
