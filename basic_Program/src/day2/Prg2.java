package day2;

import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nc=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum*10+d;
			n/=10;
		}
		if(nc==sum)System.out.println(nc+" is a Palindrome");
		else System.out.println(nc+"is not apalindrome");

	}

}
