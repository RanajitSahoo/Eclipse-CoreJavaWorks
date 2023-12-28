package com.jsp.day7;

public class Prg1 {
	public static void main(String[] args) {
		int star=1;
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<=n/2)star++;
			else star--;
			System.out.println();
		}
	}

}
