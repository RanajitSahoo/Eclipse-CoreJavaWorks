package com.jsp.String;

class Student{
	String name;
	int age;
	int mark;
	static String institute;
	public Student(String n,int a,int m,String i) {
		this.name=n;
		this.age=a;
		this.mark=m;
		institute=i;
	}
	@Override
	public String toString() {
		return "Student [name= "+this.name+" age = "+this.age+" mark = "+this.mark+" institute = "+Student.institute+"]";
	}
}

public class PrintCustomString {

	public static void main(String[] args) {
		Student s=new Student("Raja",26,99,"Jspider");
		System.out.println(s);
		
	}

}
