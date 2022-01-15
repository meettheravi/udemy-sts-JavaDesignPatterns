package com.bharath.patterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("TestName");
		System.out.println(instance.getName());
	}

}
