package com.jsp.Stringwrrrw;

public class Prg7 {

	public static void main(String[] args) {
		String s="banana";
		char[] c=s.toCharArray();
		int small=s.length();
		char ch='a';
		for(int i=0;i<c.length-1;i++) {
			int cn=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					cn++;
				}
			}
			if(small>cn) {
				small=cn;
				
				ch=c[i];
			}
			
		}
		System.out.println(ch+""+small);

	}

}
