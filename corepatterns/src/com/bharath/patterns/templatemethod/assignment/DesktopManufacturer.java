package com.bharath.patterns.templatemethod.assignment;

import java.util.List;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk(List<String> computer) {
		computer.add("Desktop Harddisk");
		System.out.println("Added Desktop Harddisk");
	}

	@Override
	public void addRAM(List<String> computer) {
		computer.add("Desktop RAM");
		System.out.println("Added Desktop RAM");
	}

	@Override
	public void addKeyboard(List<String> computer) {
		computer.add("Desktop Keyboard");
		System.out.println("Added Desktop Keyboard");
	}

}
