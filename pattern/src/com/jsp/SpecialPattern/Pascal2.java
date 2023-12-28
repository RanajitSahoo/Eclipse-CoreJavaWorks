package com.jsp.SpecialPattern;

public class Pascal2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				System.out.print(" ");
			}
			int n=(int)Math.pow(11, i);
			for(int j=n;j>0;j/=10) {
				System.out.print(j%10+" ");
			}
			System.out.println();
		}

	}

}
