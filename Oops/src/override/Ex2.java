package override;
class A{
	void m1(int i) {
		System.out.println("non-static M1(int) in A");
	}
	static void m1() {
		System.out.println("static M1(int) in A");
	}
	
}
class B extends A{
	void m1(int i) {
		System.out.println("non-static M1(int) in B");
	}
	static void m1() {
		System.out.println("static M1(int) in B");
	}
	
	
}
class C extends A{
	void m1(int i) {
		System.out.println("non-static M1(int) in C");
	}
	static void m1() {
		
		System.out.println("static m1 in class C");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		A  a1=new B();
		a1.m1(1);
		a1.m1();
		a1=new C();
		a1.m1(1);
		a1.m1();
		
		

	}

}
