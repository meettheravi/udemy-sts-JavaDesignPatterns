package com.bharath.patterns.facade;

public class OrderFacade {

	public void processOrder(String name, int quantity) {
		OrderProcessor processor = new OrderProcessor();
		if (processor.checkStock("Macbook")) {
			String orderId = processor.placeOrder(name, quantity);
			processor.shipOrder(orderId);
		}
	}
}
