package Inheritance;

class A{
	static {
		System.out.println("Static A");
	}
	{
		System.out.println("non-Static A");
	}
	A(){
		System.out.println("Constructor A");
	}
}
class B extends A{
	static {
		System.out.println("Static B");
	}
	{
		System.out.println("non-static B");	
	}
	B(){
		System.out.println("constructor B");
	}
}

public class Ex1 {
	public static void main(String... args) {
		A a=new A();
		B b=new B();
	}
}
