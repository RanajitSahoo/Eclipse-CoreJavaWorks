package com.jsp.String;

public class Prg19 {

	public static void main(String[] args) {
		String s1="ebcxyz";
		int en=5;
		System.out.println(encoding(s1,en));

	}
	
	public static String encoding(String s,int encode) {
		char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] ch=s.toCharArray();
		int i=0;
		String s1="";
		while(i<ch.length) {
			int index=ch[i]-'a';
			index+=(encode%26);
			s1+=alpha[index%26];
			i++;
		}
		return s1;
	}
	

}
