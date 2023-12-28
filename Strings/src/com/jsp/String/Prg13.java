package com.jsp.String;

public class Prg13 {

	public static void main(String[] args) {
		String s1="aaabbcdda";
		char[] ch=s1.toCharArray();
		int i=0;
		int j=0;
		
		String s2="";
		while(i<ch.length) {
			char c=ch[i];
			int cn=0;
			while(i<ch.length&&c==ch[i]) {
				cn++;i++;
			}
			s2+=c+""+cn;
		}
		System.out.println(s2);

	}

}
