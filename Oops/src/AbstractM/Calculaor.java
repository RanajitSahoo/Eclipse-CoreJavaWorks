package AbstractM;

public class Calculaor {
	
	void calculate(Numbers n) {
		int a=n.add(n.a,n.b);
		int b=n.sub(n.a,n.b);
		int c=n.mul(n.a,n.b);
		int d=n.div(n.a,n.b);
		int e=n.mod(n.a,n.b);
		System.out.println("add ="+a);
		System.out.println("sub ="+b);
		System.out.println("mul ="+c);
		System.out.println("div ="+d);
		System.out.println("mod ="+e);
		
	}
}
