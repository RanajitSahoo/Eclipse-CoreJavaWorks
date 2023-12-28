package recursion;

public class ArmStrong {
	static int prd=1;
	static int armstrong(int n,int c) {
		if(n==0) return 0;
		return prd(n%10,c)+armstrong(n/10, c);
	}
	static int prd(int d,int c) {
		if(c==0)return 1;
		return d*prd(d,c-1);
	}

	public static void main(String[] args) {
		
			int n=153;
			if(armstrong(n,3)==n) System.out.println("Armstrong number");
			else System.out.println(" NOt Armstrong number");
	}

}
