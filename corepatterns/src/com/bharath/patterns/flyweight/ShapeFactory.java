package com.bharath.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static Map<String, Shape> shapes = new HashMap<>();

	public static Shape getShape(String type) {
		Shape shape = null;

		if (shapes.containsKey(type)) {
			shape = shapes.get(type);
		} else {
			if (type.equals("Circle")) {
				shape = new Circle();
			} else if (type.equals("Rectangle")) {
				shape = new Rectangle();
			}
			shapes.put(type, shape);
		}

		return shape;
	}
}
