package com.bridgelabz.functional_interface;

@FunctionalInterface
public interface IMath {

	public int add(int n1,int n2);
	
	public static void test() {
		System.out.println("static method in interface");
	}
	
	default void defaultMerhod() {
		System.out.println("default method in interface");
	}
}
