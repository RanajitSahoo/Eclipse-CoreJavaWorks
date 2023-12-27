package operator;

public class Bitwise {

	public static void main(String[] args) {
		int a =-13,b =-14;
		int c = a&b;
		int d = a|b;
		int e = a^b;
		int f = ~a;
		int g= a>>3;
		System.out.println("a&b= "+c);
		System.out.println("a|b= "+d);

		System.out.println("a^b= "+e);

		System.out.println("~a= "+f);
		System.out.println("a>>2 "+g);


	}

}
