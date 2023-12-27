package Loop;

import java.util.Scanner;

public class Automorphic2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n=s.nextInt();
		int nc=n;
		int sqr=n*n;
		int c=0;
		while(n>0) {
			c++;
			n/=10;
		}
		int sum=0;
		
		while(c>0) {
				int d=sqr%10;
				sum =sum*10+d;
				sqr/=10;
				c--;
		}
		int sumc=sum;
		int res=0;
		while (sum>0) {
			int d=sum%10;
			res=res*10+d;
			sum/=10;
		}
		if(res==nc) System.out.println("automorphic");
		else System.out.println("not automorphic");
		
	}

}
