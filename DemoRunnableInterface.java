// Demonstration of a program to create multiple Threads using runnable inteface
package com.exe;

class MyRunnable implements Runnable {
  @Override
  public void run() {
		System.out.println("Thread Name:" +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class DemoRunnableInterface {
  public static void main(String[] args) {
    // Create a Runnable object
    MyRunnable runnable = new MyRunnable();

    // Create and start multiple threads with the same Runnable
    for (int i = 0; i < 3; i++) {
      Thread thread = new Thread(runnable);
      thread.setName("Thread-" + (i + 1));  // Set custom thread name
      thread.start();
    }
  }
}
