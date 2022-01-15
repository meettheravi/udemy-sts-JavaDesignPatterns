package com.bharath.patterns.templatemethod.assignment;

import java.util.List;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk(List<String> computer) {
		computer.add("Laptop Harddisk");
		System.out.println("Added Laptop Harddisk");
	}

	@Override
	public void addRAM(List<String> computer) {
		computer.add("Laptop RAM");
		System.out.println("Added Laptop RAM");
	}

	@Override
	public void addKeyboard(List<String> computer) {
		computer.add("Laptop Keyboard");
		System.out.println("Added Laptop Keyboard");
	}

}
