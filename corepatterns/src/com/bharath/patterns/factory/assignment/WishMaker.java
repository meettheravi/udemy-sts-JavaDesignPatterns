package com.bharath.patterns.factory.assignment;

public class WishMaker {

	public void getSomeWish(String type) {
		Person p = PersonFactory.createPerson(type);
		p.wish();
	}
}
