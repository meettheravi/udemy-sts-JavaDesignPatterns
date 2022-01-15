package com.bharath.patterns.singleton.assignment;

public class Logger implements Cloneable {

	private static volatile Logger instance;
	private int count;

	private Logger() {

	}

	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public synchronized void log(String message) {
		System.out.println(++count + ": " + message);
	}
}
