package com.bharath.patterns.facade;

public class Test {

	public static void main(String[] args) {

		OrderFacade facade = new OrderFacade();
		facade.processOrder("Macbook", 3);

	}

}
