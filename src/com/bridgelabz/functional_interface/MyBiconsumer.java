package com.bridgelabz.functional_interface;

import java.util.function.BiConsumer;

public class MyBiconsumer {

	public static void main(String[] args) {
		

		BiConsumer<Integer, Integer> biconsumer = (x,y)->{
			int c = x+y;
			System.out.println(c);
		}; 
		biconsumer.accept(1, 1);
	}
}
