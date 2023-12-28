package day2;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		System.out.println(rev);
	}

}
