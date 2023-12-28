package recursion;

public class HappyNumber {
	
	static int happy(int n) {
		if(n<=9) return n;
			
			if(n>=10) {
				int sum=0;
				while(n>0) {
					int d=n%10;
					sum+=d*d;
					n/=10;
				}
				n=sum;
			}
			
		return happy(n);
		
	}

	public static void main(String[] args) {
		
		
		if(happy(14)==1) System.out.println("Happy Number");
		else System.out.println("Not a HAppy number");
	}

}
