package recursion;

public class ArmstrongNumber {
	
	static int sum=0,count=0,prd=1;
	
	static int armStrong(int n,int c) {
		if(n<=0) return 0;
		
		int d=n%10;// fetch the last digit of given number
		
		int p=prd(d,c);
		
		sum=sum+p;
		
		
		armStrong(n/10,c);
		
		return sum;
		
	}
	
	static int prd(int d,int c) {
		if(c==0) return 1;
		return d*prd(d,c-1);
	}
	
	
	public static void main(String[] args) {
		int n=153;
	
		
		if(armStrong(n,3)==n) System.out.println("armStrong");
		else System.out.println("not armstrong");

	}

}
