package Object;

class A{
	int i;
	void m1() {
		int i=1;
		System.out.println(i);
		System.out.println(this.i);
	}
}

public class Ex3 {

	public static void main(String[] args) {
		A a=new A();
		a.m1();

	}

}
