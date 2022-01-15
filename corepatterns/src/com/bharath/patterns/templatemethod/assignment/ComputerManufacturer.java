package com.bharath.patterns.templatemethod.assignment;

import java.util.ArrayList;
import java.util.List;

public abstract class ComputerManufacturer {

	public void buildComputer() {
		List<String> computer = new ArrayList<>();
		System.out.println("Computer build started. Current components: " + computer);

		addHardDisk(computer);
		addRAM(computer);
		addKeyboard(computer);

		System.out.println("Computer build completed. Current components: " + computer);

	}

	public abstract void addHardDisk(List<String> computer);

	public abstract void addRAM(List<String> computer);

	public abstract void addKeyboard(List<String> computer);
}
