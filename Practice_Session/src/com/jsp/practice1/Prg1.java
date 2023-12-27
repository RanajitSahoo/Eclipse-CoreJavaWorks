package com.jsp.practice1;

class Person{
	
}
class Doctor extends Person{
	String Spec;
	public Doctor(String s) {
		super();
		this.Spec=s;
	}
	
}
class Raja extends Doctor{
	public Raja(String s,String n) {
		super(n);
	}
}
public class Prg1 {

	public static void main(String[] args) {
		
		Raja d=new Raja("Raja","Developer");
		
		System.out.println(d.Spec);
	}

}
