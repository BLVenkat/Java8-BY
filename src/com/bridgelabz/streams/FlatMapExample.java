package com.bridgelabz.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<Integer> even = Arrays.asList(2,4,6);
		
		List<Integer> odd = Arrays.asList(1,3,5);
		
		List<List<Integer>> numbers = Arrays.asList(even,odd);
		
		List<List<List<Integer>>> nestedList = Arrays.asList(numbers);
		
		//List<Stream<Integer>> mapStream = numbers.stream().map(data -> data.stream().collect(Collectors.toList()));
		
		List<Integer> flatMapList = numbers.stream().flatMap(data -> data.stream()).collect(Collectors.toList());
		
		System.out.println(flatMapList);
	}
}
