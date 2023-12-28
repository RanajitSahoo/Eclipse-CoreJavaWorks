package com.jsp.String;

public class Prg31 {

	public static void main(String[] args) {
		String s1="abcdz";
		int de=2;
		char[] alph="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] arr=s1.toCharArray();
		String s2="";
		for(char c:arr) {
			int index=c-'a';
			index=-((de%26)-index-26);
			s2+=alph[index%26];
		}
		
		System.out.println(s1.equals(encoding(s2, de)));

	}
	public static String encoding(String s1,int en) {
		char[] alph="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] arr=s1.toCharArray();
		String s2="";
		for(char c:arr) {
			int index=c-'a';
			index+=en%26;
			s2+=alph[index%26];
		}
		return s2;
	}

}
