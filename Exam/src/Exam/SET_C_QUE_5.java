package Exam;

public class SET_C_QUE_5 {
	
	public static boolean isPrime(int n) {
		int num=n;
		boolean prime =true;
		if(num<=1) prime =false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)prime=false;
		}
		return prime;
	}

	public static void main(String[] args) {
		
		for(int i=100;i>=1;i--) {
			if(isPrime(i))System.out.println(i);
		}
	}

}
