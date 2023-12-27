package MethodHiding;

public class A {
	public static void m1() {
		System.out.println("m1() in A");
	}

}
class B extends A{
	public static void m1() {
		System.out.println("m1() in B");
	}
}

