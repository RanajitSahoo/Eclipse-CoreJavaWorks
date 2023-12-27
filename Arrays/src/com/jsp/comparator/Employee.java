package com.jsp.comparator;

public class Employee  implements Comparable{

	String name;
	int sal;
	int id;
	public static int num=1000;
	public Employee(String name,int sal) {
		this.name=name;
		this.sal=sal;
		this.id=num++;
	}
	
	@Override
	public String toString() {
		return "Employee[ name= "+name+" ,id= "+id+" ,sal= "+sal+"]";
	}

	@Override
	public int compareTo(Object o) {
		return ((Employee)o).name.compareTo(this.name);
	}
	
	

}
