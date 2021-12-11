package com.bridgelabz.functional_interface;

import java.util.function.BiPredicate;

public class MyBiPredicate {

	public static void main(String[] args) {

		BiPredicate<String, String> biPredicate = (name, searchKey) -> 
		                                            name.endsWith(searchKey);
		System.out.println(biPredicate.test("Venkat", "t"));
	}
}
