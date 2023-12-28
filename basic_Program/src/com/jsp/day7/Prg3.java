package com.jsp.day7;

public class Prg3 {

	public static void main(String[] args) {
		int star=1;
		
		int n=9;
		int space=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=star;j>=1;j--) {
				if(j==1||j==star)System.out.print("*");
				else System.out.print(" ");
			}
			if(i<=n/2) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
		}

	}

}
