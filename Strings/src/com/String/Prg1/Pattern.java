package com.String.Prg1;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		int space=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
