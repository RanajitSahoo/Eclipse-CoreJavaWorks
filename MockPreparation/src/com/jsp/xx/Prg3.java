package com.jsp.xx;

public class Prg3 {

	public static void main(String[] args) {
		int a=8;
		int b=6;
		int n=a<b?a:b;
//		int t=n;
		while(true) {
			if(a%n==0&&b%n==0)break;
			n--;
		}
		System.out.println(n);

	}

}
