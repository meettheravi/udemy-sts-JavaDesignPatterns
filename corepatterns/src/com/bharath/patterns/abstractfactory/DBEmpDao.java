package com.bharath.patterns.abstractfactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving employee to DB.");
	}

}
