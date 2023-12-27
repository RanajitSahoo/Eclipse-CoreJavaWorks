package raja.finalmock.Practice;

public class Prg39 {

	public static void main(String[] args) {
		int n=1458;
		int nc=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		
		n=nc;
		int sc=sum;
		int rev=0;
		
		while(sum>0) {
			int d=sum%10;
			rev=rev*10+d;
			
			sum/=10;
		}
		
		int res=sc*rev;
		if(n==res)System.out.println("magic");
		else System.out.println("not");

	}

}
