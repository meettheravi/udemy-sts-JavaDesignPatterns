package com.bharath.patterns.templatemethod.assignment;

public class Test {

	public static void main(String[] args) {

		ComputerManufacturer cm = new LaptopManufacturer();
		cm.buildComputer();
	}

}
