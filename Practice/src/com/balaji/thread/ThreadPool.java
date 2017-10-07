package com.balaji.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

	private int t;

	public WorkerThread(int i) {
		this.t = i;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start of thread : " + t);
		ThreadGroup tg;
		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Thread ends");
	}
}

public class ThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 3; i++) {
			Runnable worker = new WorkerThread(i);
			// WorkerThread worker = new WorkerThread(i);
			System.out.println(System.currentTimeMillis());
			Thread.sleep(1000);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
