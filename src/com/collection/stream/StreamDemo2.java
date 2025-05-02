package com.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {

	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id  +"  " + "  " + name + " -  "+ salary; 
	}

}

public class StreamDemo2 {

	public static void main(String[] args) {

		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "jeet", 1200));
		employees.add(new Employee(102, "jay", 100));
		employees.add(new Employee(103, "parth", 80));
		employees.add(new Employee(104, "kishan", 1300));
		
		//employees.stream().forEach(x->System.out.println(x));
		
//		List<Employee> filtemployees = new ArrayList<Employee>();
//		//employees.stream().filter(x->x.salary>1000).forEach(x->System.out.println(x));
//		for(Employee e:employees) {
//			if(e.salary>1000) {
//				filtemployees.add(e);
//			}
//		}
		
		
		
		List<Employee> filtEmployees = employees.stream().filter(x->x.salary>1000).collect(Collectors.toList());
		//Set<Employee> filtEmployees = employees.stream().collect(Collectors.toSet());
		filtEmployees.stream().forEach(x->System.out.println(x));
		
		
		
		
		
		
		
		
	}
}
