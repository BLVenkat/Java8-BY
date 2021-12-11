package com.bridgelabz.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mypredicate {

	public static void main(String[] args) {
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		Predicate<Integer> predicate = (data) ->{
			
			if(data%2==0) {
				return true;
			}
			return false;
		};
		
		Stream<Integer> intergerStream1 = integerList.stream().filter((data) -> {
			
			if(data%2==0) {
				return true;
			}
			return false;
		});

		Stream<Integer> intergerStream = integerList.stream().filter(predicate);
		
		List<Integer> evenList =  intergerStream.collect(Collectors.toList());
		
		evenList.forEach((data) -> System.out.println(data));
	}
}
