package com.bharath.patterns.singleton.assignment;

public class LoggerTest {

	public static void main(String[] args) throws InterruptedException {
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();

		Thread t1 = new Thread(() -> {
			int i = 0;
			while (i < 10) {
				l1.log("Thread1");
				i++;
			}
		});
		Thread t2 = new Thread(() -> {
			int i = 0;
			while (i < 10) {
				l1.log("Thread2");
				i++;
			}
		});

		t1.start();
		t2.start();

	}

}
