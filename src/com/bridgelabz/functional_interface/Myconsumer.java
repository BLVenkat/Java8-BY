package com.bridgelabz.functional_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Myconsumer {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "venkat");
		map.put(2, "sunil");
		
		Consumer<Integer> consumer = (data) -> System.out.println(data);  
		
		Consumer<Integer> evenConsumer = (data) -> {
			if(data%2==0) {
				System.out.println(data);
			}
		};
		
		BiConsumer<Integer, String> biConsumer = 
				                         (key,value) -> System.out.println(key+" "+value);
		integerList.forEach(consumer);
		
		System.out.println("even Integers");
		
		integerList.forEach(evenConsumer);
		
		map.forEach(biConsumer);
	}
}
