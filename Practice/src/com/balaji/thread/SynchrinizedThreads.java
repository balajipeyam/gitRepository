package com.balaji.thread;

//Table for Synchronized Method
class Table {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// Table for Synchronized block
class Table2 {
	void printTable(int n) {
		
		
		
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n + " X " + i + " = " + n * i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class ThreadClass1 extends Thread {
	private Table t;
	private int n;

	public ThreadClass1(Table t, int n) {
		this.t = t;
		this.n = n;
	}

	@Override
	public void run() {
		t.printTable(n);
	}

}

/*
 * class ThreadClass2 extends Thread { private Table t; private int n;
 * 
 * public ThreadClass2(Table t, int n) { this.t = t; this.n = n; }
 * 
 * @Override public void run() { t.printTable(n); }
 * 
 * }
 */

public class SynchrinizedThreads {
	public static void main(String[] args) {
		Table t = new Table();
		ThreadClass1 t1 = new ThreadClass1(t, 5);
		ThreadClass1 t2 = new ThreadClass1(t, 10);
		t1.start();
		t2.start();
	}

}
