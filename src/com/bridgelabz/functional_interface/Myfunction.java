package com.bridgelabz.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Myfunction {

	public static void main(String[] args) {
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		Function<Integer, String> function = (data) ->{
			return data+" "+"Convered to string";
		};
		
		List<String> convertedData =  integerList.stream().map(function)
				                                 .collect(Collectors.toList());
		convertedData.forEach((data) -> System.out.println(data));
	}
}
