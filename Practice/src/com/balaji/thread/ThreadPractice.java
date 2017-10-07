package com.balaji.thread;

public class ThreadPractice extends Thread {
	private String name;

	public ThreadPractice(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " : Thread starts waiting for 5S");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Running Thread : " + name);
	}

	public static void main(String[] args) {
		Thread t1 = new ThreadPractice("t1");
		Thread t2 = new ThreadPractice("t2");
		t1.start();
		t2.start();
		System.out.println("main done");
	}
}
