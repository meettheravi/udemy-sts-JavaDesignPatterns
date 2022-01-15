package com.bharath.patterns.adapter.assignment;

public class PaymentAdapter {

	public void pay(int rupees) {

		int dollars = rupees * 70;

		PaymentProcessor processor = new PaymentProcessorImpl();
		processor.pay(dollars);

	}

}
