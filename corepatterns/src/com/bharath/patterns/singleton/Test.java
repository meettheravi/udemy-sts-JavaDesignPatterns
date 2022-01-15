package com.bharath.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	static DateUtil dateUtil4;
	static DateUtil dateUtil5;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = DateUtil.getInstance();
		System.out.println(dateUtil1 == dateUtil2);
		
		/*
		 * Verify serialization and de-serialization test
		 */
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/ravi_mishra1/Documents/singleton/dateUtil.ser")));
		oos.writeObject(dateUtil1);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/ravi_mishra1/Documents/singleton/dateUtil.ser")));
		DateUtil dateUtil3 = null;
		dateUtil2 = (DateUtil) ois.readObject();
		
		oos.close();
		ois.close();

		System.out.println(dateUtil1 == dateUtil3);

		/*
		 * For multithreading test
		 */
		Thread t1 = new Thread(() -> {
			dateUtil4 = DateUtil.getInstance();
			System.out.println("DateUtil4 set");
		});
		Thread t2 = new Thread(() -> {
			dateUtil5 = DateUtil.getInstance();
			System.out.println("DateUtil5 set");
		});

		t1.start();
		t2.start();

		System.out.println(dateUtil4 == dateUtil5);
		Thread.sleep(1000);
		System.out.println(dateUtil4 == dateUtil5);

	}

}
