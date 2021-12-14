package com.bridgelabz.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {

		List<String> stringValues1 = new ArrayList<String>();

		List<Employee> employees = Arrays.asList(new Employee(1, "venkat"), new Employee(3, "amit"),
				new Employee(2, "sunila"), new Employee(4, "aniket"));

		List<String> stringValues = employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());

		System.out.println(stringValues);

		employees.stream().map(employee -> {
			stringValues1.add(employee.getName());
			return stringValues1;
		});

		List<Teacher> teachers = employees.stream().map(data -> new Teacher(data.getEmpId(), data.getName()))
				.collect(Collectors.toList());
		System.out.println(teachers);
	}
}
