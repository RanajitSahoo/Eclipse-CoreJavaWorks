package Constructor;

class A{
	A(){
		System.out.println("constructor called");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		new A();
		new A();
		new A();
	}

}
