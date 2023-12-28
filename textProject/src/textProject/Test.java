package textProject;

class A{
	A(){
		
		System.out.println("A");
	}
	 static void m1() {
		System.out.println("private A");
	}
}
class B extends A{
	B(){
		
		System.out.println("B");
	}
	static void m1() {
		System.out.println("private B");
	}
}
class C extends B{
	C(){
		
		System.out.println("C");
	}
	static void m1() {
		System.out.println("private C");
	}
}


