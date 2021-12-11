package com.bridgelabz.functional_interface;

import java.util.function.BiFunction;

public class MyBiFunction {
   public static void main(String[] args) {
	
	   BiFunction<Integer, Integer, Integer> biFunction = (x,y) -> x+y;
	   
	  System.out.println(biFunction.apply(2, 2));
   }
}
