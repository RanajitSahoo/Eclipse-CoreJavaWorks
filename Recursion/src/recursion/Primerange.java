package recursion;

public class Primerange {
	static boolean prime(int n) {
		if(n<=1) return false;
		return divide(n,2);
	}
	static boolean divide(int n,int i) {
		if(i>n/2) return true;
		if(n%i==0) return false;
		
		return divide(n,i+1);
	}

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(prime(i)) System.out.println(i);
		}

	}

}
