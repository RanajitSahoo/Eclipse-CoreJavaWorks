package com.jsp.tostring;

class Student{
	String name;
	int marks;
	public Student(String s,int m) {
		this.name=s;
		this.marks=m;
	}
	
	@Override
	public String toString() {
		return "Student[ name= "+this.name+" marks= "+this.marks+"]";
	}
	
}

public class Test {
	public static void main(String[] args) {
		Student s=new Student("Raza",99);
		System.out.println(s);
	}

}
