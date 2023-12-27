package Exam;

import java.util.Scanner;

public class SET_A_QUE_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a NUMBER ");
		int n=s.nextInt();
		boolean prime=true;
		if(n<=1)prime =false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) System.out.println(n+" is a prime number");
		else System.out.println(n+" is not a prime number");

	}

}
