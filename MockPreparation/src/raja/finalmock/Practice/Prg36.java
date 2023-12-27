package raja.finalmock.Practice;

public class Prg36 {

	public static void main(String[] args) {
		int n=5;
		if(isPrime(n))System.out.println("prime");
		else System.out.println("not prime");

	}
	public static boolean isPrime(int n) {
		if(n<=1)return false;
		for(int i=2;i<n/2;i++) {
			if(n%i==0)return false;
		}
		return true;
	}

}
