package com.bridgelabz.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class MySupplier {

	public static void main(String[] args) {
		  String str = "Venkat";
		  
		  List<Integer> integerList = new ArrayList<Integer>();
			integerList.add(1);
			integerList.add(2);
			integerList.add(3);
			integerList.add(4);
			
		  Supplier<Character> supplier = () -> str.charAt(0);
		  System.out.println(supplier.get());
		  
		  Supplier<Integer> listSupplier = () -> {
			  return integerList.size();
		  };
		  
		  System.out.println(listSupplier.get());
		  
		  BooleanSupplier booleanSupplier = () -> str.contains("Venkat");
		  
		  System.out.println(booleanSupplier.getAsBoolean());
		
	}
}
