package Loop;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n=s.nextInt();
		int nc=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		int sumc=sum;
		int revsum=0;
		while(sum>0) {
			int d=sum%10;
			revsum=revsum*10+d;
			sum/=10;
		}
		int res=revsum*sumc;
		if(res==nc) System.out.println("Magic Number");
		else System.out.println("Not magic number");

	}

}
