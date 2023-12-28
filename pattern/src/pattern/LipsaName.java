package pattern;

import java.util.Scanner;

public class LipsaName {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int l=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(i==n||j==1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			
		}
		System.out.print(" ");
		for(int j=1;j<=n;j++) {
			if(i==1||i==n||j==n/2+1) {
				System.out.print("*");
			}
			else System.out.print(" ");
		}
		System.out.print(" ");
		for(int j=1;j<=n;j++) {
			if(i<=l+1) {
				if(i==1||i==n||j==n||j==1||i==l+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}else {
				if(j==1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
		}
		System.out.print(" ");
		for(int j=1;j<=n;j++) {
			if(i<=l+1) {
				if(i==1||j==1||i==l+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}else {
				if(j==n||i==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
		}
		System.out.print("  ");
		for(int j=1;j<=n;j++) {
			if(i<=l+1) {
				if(i==1||i==n||j==n||j==1||i==l+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}else {
				if(j==1||j==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
		}
	
		System.out.print(" ");
		for(int j=1;j<=n;j++) {
			if(i<=l+1) {
				if(i==1||j==1||i==l+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}else {
				if(j==n||i==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
		}
		System.out.print(" ");
		for(int j=1;j<=n;j++) {
			if(i==1||i==n||j==n/2+1) {
				System.out.print("*");
			}
			else System.out.print(" ");
		}
		System.out.print(" ");
		for(int j=1;j<=n;j++) {
			if(i<=l+1) {
				if(i==1||j==1||i==l+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}else {
				if(j==n||i==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
		}
		System.out.print(" ");
		for(int j=1;j<=n;j++) {
			if(j==1||i==n/2+1||j==n) {
				System.out.print("*");
			}
			else System.out.print(" ");
		}
		System.out.println();
		}

	}

}
