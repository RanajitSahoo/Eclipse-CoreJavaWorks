package com.jsp.Stringwrrrw;

public class Prg6 {

	public static void main(String[] args) {
		String s="banana";
		char[] c=s.toCharArray();
		int big=0;
		char ch='b';
		for(int i=0;i<c.length;i++) {
			int cn=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					cn++;
					
				}
			}
			if(big<cn) {
				big=cn;
				ch=c[i];
			}
			
		}
		System.out.println(big+""+ch);

	}

}
