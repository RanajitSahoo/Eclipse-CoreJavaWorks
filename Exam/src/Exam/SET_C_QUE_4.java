package Exam;

import java.util.Scanner;

public class SET_C_QUE_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a NUMBER ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
