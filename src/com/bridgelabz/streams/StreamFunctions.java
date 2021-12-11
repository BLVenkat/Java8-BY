package com.bridgelabz.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctions {

	public static void main(String[] args) {
		
		List<Employee> employees =  Arrays.asList(new Employee(1, "venkat"), 
				                                  new Employee(3, "amit"), 
				                                  new Employee(2, "sunil"),
				                                  new Employee(4, "aniket"));
		
		//Filter with orElse 
		Employee emp = employees.stream().filter((employee) -> employee.getEmpId() == 2)
		                  .findFirst()
		                  .orElseThrow(() -> new EmployeeException("employee with Id not present"));
		System.out.println(emp);
		System.out.println();
	
	//stream sorting
	List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getEmpId))
			                                              .collect(Collectors.toList());	
	System.out.println("sorted list");
	sortedEmployees.forEach(System.out::println);
	
		//Stream min function
		Employee minEmployee =  employees.stream().min(Comparator.comparingInt(Employee::getEmpId )).get();
		System.out.println();
		System.out.println("Employee with min ID");
		System.out.println(minEmployee);
		
		//Stream min function
				Employee maxEmployee =  employees.stream().max(Comparator.comparingInt(Employee::getEmpId )).get();
				System.out.println();
				System.out.println("Employee with max ID");
				System.out.println(maxEmployee);
		
	}
}
