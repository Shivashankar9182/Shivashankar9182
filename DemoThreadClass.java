//Demostration of a program to create multiple Threads using Thread class
package com.exe;
//defining thread using thread class
class MyThread extends Thread {
	
	String threadname;
	
  public MyThread(String threadname) {
		super();
		this.threadname = threadname;
	}

  	@Override
  	//running state
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


public class DemoThreadClass {
	
  public static void main(String[] args) {
    // Create and start multiple threads
    for (int i = 0; i < 3; i++) {
      MyThread thread = new MyThread("Thread");
      thread.setName("Thread-" + (i + 1));  // Set custom thread name
      thread.start();
    }
  }
}
