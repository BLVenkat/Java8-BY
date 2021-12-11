package com.bridgelabz.functional_interface;

import java.util.ArrayList;
import java.util.List;

public interface Main {

	public static void main(String[] args) {
		
		IMath imath = (n1, n2) -> n1+n2;
		
		System.out.println(imath.add(1, 1));
		
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		
		List<Integer> list2 = new ArrayList();
		
		
		
		Test test = (integerList) -> {
			
			list2.add(integerList.get(0));
			return integerList.get(0);
		};
		
		//list2 = new ArrayList();
		System.out.println(test.getFirstValue(list));
		list.add(3);
		
		list.forEach((n1)-> System.out.println(n1));
		IMath.test();
	}

}
