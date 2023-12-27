package com.jsp.comparator;

import java.util.Arrays;

public class TestEmploee {

	public static void main(String[] args) {
		Employee[] arr= {
						new Employee("Raja",10000),
						new Employee("Ravish",20000),
						new Employee("Raveesh",90000),
						new Employee("Kishore",70000),
						new Employee("Ramana",80000),
						new Employee("Dhruba",40000),
						new Employee("Agnha",30000),
						new Employee("Jyosthna",50000),
						
						};
		Arrays.sort(arr,new SalCompartable());
		for(Employee e:arr) {
			System.out.println(e);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		Arrays.sort(arr);
		for(Employee e:arr) {
			System.out.println(e);
		}

	}

}
