package pattern;

public class Demo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a&b;
		a=a^b;
		b=c<<1;
		c=a&b;
		a=a^b;
		System.out.println(a);
		
	}

}
