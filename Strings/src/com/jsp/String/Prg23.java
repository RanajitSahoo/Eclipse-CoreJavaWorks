package com.jsp.String;

public class Prg23 {

	public static void main(String[] args) {
		String s1="java is easy";
		char[] ch=s1.toCharArray();
		int i=0;
		int j=0;
		String s2="";
		while(i<ch.length) {
			j=i;
			while(j<ch.length&&ch[j]!=' ')j++;
			int k=j-1;
			String temp="";
			while(k>=i) {
				temp+=ch[k];
				k--;
			}
			s2+=temp+" ";
			j++;
			i=j;
		}
		System.out.println(s2);

	}

}
