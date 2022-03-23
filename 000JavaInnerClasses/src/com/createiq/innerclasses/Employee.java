package com.createiq.innerclasses;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1003, "balu");
		Employee e2 = new Employee(1005, "raju");
		Employee e3 = new Employee(1001, "laxmi");
		Employee e4 = new Employee(1002, "anil");
		Employee e5 = new Employee(1004, "abcd");

		Employee[] emps = { e1, e2, e3, e4, e5 };
//		int [] a;
//		Arrays.sort(emps);
//		System.out.println(Arrays.toString(emps));

//		// annonymous class
//		Comparator<Employee> sortEmpIds = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getId() - o2.getId();
//			}
//		};
//
//		Comparator<Employee> nameBasedSorting = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
//
//		Arrays.sort(emps, nameBasedSorting);
//		for (Employee employee : emps) {
//			System.out.println(employee);
//		}

//		String fruits[] = { "mango", "bananana", "apple", "orange" };
//
//		Arrays.sort(fruits);
//		for (String fruit : fruits) {
//			System.out.println(fruit);
//		}
	}

}
