package com.bridgelabz.streams;

import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
			
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		Stream<Integer> integerStream =   stream.filter(x ->{
			
			System.out.println(x+"in process");
			if(x%2 == 0) {
				return true;
			}
			return false;
		});
		
		System.out.println("its end");
		
		System.out.println("Count "+integerStream.count());
	}
}
