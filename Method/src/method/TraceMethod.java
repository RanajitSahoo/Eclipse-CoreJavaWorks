package method;

public class TraceMethod {
	static void m1(int i) {
		System.out.print(i);
		if(i==3) return;
		m1(i+1);
		m1(i+1);
		m1(i+1);
		System.out.print(i);
	}

	public static void main(String[] args) {
		
		m1(1);
	}

}
