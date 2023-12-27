package com.jsp.practice1;

 class A{
	
}
 final class B extends A{
	int a;
}

public class Prg2 {
	public static void main(String[] args) {
		B b=new B();
		b.a=10;
		b.a=11;
		System.out.println(b.a);
		
	}
}
