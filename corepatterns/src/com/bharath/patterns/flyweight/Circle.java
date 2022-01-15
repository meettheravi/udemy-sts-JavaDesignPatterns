package com.bharath.patterns.flyweight;

public class Circle extends Shape {

	private String label;

	public Circle() {
		label = "circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println("Drawing a " + label + " with radius:" + radius + " fillColor:" + fillColor + " lineColor:"
				+ lineColor);
	}
}
