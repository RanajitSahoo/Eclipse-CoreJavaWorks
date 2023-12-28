package com.jsp.day6;

public class Prg2 {

	public static void main(String[] args) {
		int sp=1;
		int star=1;
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
