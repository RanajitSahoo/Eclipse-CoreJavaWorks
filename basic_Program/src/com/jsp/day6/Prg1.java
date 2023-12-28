package com.jsp.day6;

public class Prg1 {

	public static void main(String[] args) {
		int sp=1;
		int star=1;
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star+=2;
			System.out.println();
		}

	}

}
