package com.jsp.SpecialPattern;

public class Prg2 {

	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		int l=(n+k)*n;
		for (int i = n; i >=1 ; i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" "+"  ");
			}
			for(int j=i;j>=1;j--) {
				if(k<=9)System.out.print(k++ +"  ");
				else System.out.print(k++ +" ");
				
			}
			for(int j=l-i+1;j<=l;j++) {
				System.out.print(j+"  ");
				
			}
			l-=i;
			
			System.out.println();
		}

	}

}
