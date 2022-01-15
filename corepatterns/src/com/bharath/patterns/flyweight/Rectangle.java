package com.bharath.patterns.flyweight;

public class Rectangle extends Shape {

	private String label;

	public Rectangle() {
		label = "rectangle";
	}

	@Override
	public void draw(int length, int breadth, String fillStyle) {
		System.out.println(
				"Drawing a " + label + " with length:" + length + " breadth:" + breadth + " fillStyle:" + fillStyle);
	}
}
