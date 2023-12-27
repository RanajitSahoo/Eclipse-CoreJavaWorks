package Exam;

import java.util.Scanner;

public class SET_B_QUE_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter low range ");
		int a=s.nextInt();
		System.out.println("Enter high range ");
		int b=s.nextInt();
		int c=0;
		for(int i=b;i>=a;i--) {
			
			boolean prime=true;
			if(i<=1)prime=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)prime =false;
			}
			
			if(prime) {
				c++;
				
				if(c==2) System.out.println(i);
			}
		}

	}

}
