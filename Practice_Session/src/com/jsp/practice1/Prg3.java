package com.jsp.practice1;
class C{
	static {
		System.out.println("static block C");
	}
	{
		System.out.println("non-static block C");
	}
	 C(){
		System.out.println("constructor C");
	}
}
class D extends C{
	static {
		System.out.println("static block D");
	}
	{
		System.out.println("non-static block D");
	}
	D(){
		System.out.println("constructor D");
	}
}

public class Prg3 {

	public static void main(String[] args) {
//		new C();
		System.out.println("-----");
		new D();
		

	}

}
