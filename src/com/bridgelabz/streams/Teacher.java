package com.bridgelabz.streams;

public class Teacher {
	private int empId;
	private String name;
	
	
	public Teacher(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [empId=" + empId + ", name=" + name + "]";
	}
}
