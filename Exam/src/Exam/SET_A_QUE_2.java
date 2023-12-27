package Exam;

import java.util.Scanner;

public class SET_A_QUE_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a size ");
		int n=s.nextInt();
		int space=n-1;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j==1||j==star||i==n)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			space--;
			star+=2;
		}

	}

}
