package raja.finalmock.Practice;

public class Prg38 {

	public static void main(String[] args) {
		int n=76;
		int nc=n;
		int i=1;
		while(n>0) {
			i*=10;
			n/=10;
		}
		n=nc;
		int num=n*n;
		int rem=num%i;
		if(rem==n)System.out.println("automor");
		else System.out.println("not");

	}

}
