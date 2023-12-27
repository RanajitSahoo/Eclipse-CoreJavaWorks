package Presen;

import java.util.Scanner;

public class Fsthalf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n=s.nextInt();
		int nc=n;
		int c=0;
		while(n>0) {
			
			c++;
			n/=10;
		}
		int hlf=c/2;
		int i=1;
		while(hlf>=0) {
			i*=10;
			hlf--;
		}
		n=nc;
		int d=n%i;
		
		n/=i;
		int rev=0;
		while(d>0) {
			int rem=d%10;
			rev=rev*10+rem;
			d/=10;
		}
		
		System.out.println("done: "+((n*i)+rev));
	}

}
