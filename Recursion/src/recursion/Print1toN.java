package recursion;

public class Print1toN {
	
	static void print(int n) {
		System.out.println(n);
		if(n==10) return;
		print(n+1);
	}

	public static void main(String[] args) {
		print(1);

	}

}
