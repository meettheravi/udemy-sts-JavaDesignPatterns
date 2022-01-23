package com.bharath.patterns.builder;

public class Test {

	public static void main(String[] args) {

//		HttpClient uglyClient = new HttpClient("GET", "http://test.com", null, null, null, null);

		HttpClient client = new HttpClient.HttpClientBuilder().method("POST").url("testURL")
				.secure("userName", "password").body("{}").build();
		System.out.println(client);
	}

}
