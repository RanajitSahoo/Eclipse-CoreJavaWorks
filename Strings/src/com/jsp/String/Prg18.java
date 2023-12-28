package com.jsp.String;

public class Prg18 {

	public static void main(String[] args) {
		String s1="abcxyz";
		int en=5;
		char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] ch=s1.toCharArray();
		int i=0;
		String s2="";
		while(i<ch.length) {
			int index=ch[i]-'a';
			index+=(en%26);
			s2+=alpha[index%26];
			i++;
		}
		System.out.println(s2);

	}

}
