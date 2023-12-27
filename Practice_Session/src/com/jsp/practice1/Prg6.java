package com.jsp.practice1;

public class Prg6 {

	public static void main(String[] args) {
		String s1="java is easy";
		char[] ch=s1.toCharArray();
		String s2="";
		int i=0;
		while(i<ch.length) {
			int j=i;
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
