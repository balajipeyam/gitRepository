package com.balaji.thread;

public class ThreadByExtends extends Thread {

	public ThreadByExtends(String name) {
		super.setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(super.getName());
			try {

				Thread.sleep(5000);
				suspend();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {
		ThreadByExtends t1 = new ThreadByExtends("T1");
		ThreadByExtends t2 = new ThreadByExtends("T2");
		ThreadByExtends t3 = new ThreadByExtends("T3");

		t1.start();
		t2.start();
		t3.start();

	}

}
