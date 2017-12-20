package com.balaji.thread;

public class ThreadByRunnable implements Runnable {
	static int i = 1;

	@Override
	public void run() {
		System.out.println("thread running " + i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread finished running");
		i++;
	}

	public static void main(String[] args) {
		Runnable r = new ThreadByRunnable();
		Runnable r2 = new ThreadByRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r2);
		System.out.println(t1.getName());
		t1.start();
		System.out.println(t2.getName());
		t2.start();
	}
}
