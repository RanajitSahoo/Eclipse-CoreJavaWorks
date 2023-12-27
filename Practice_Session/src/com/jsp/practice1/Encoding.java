package com.jsp.practice1;

public class Encoding {

	public static void main(String[] args) {
		String s1="xyz";
		int en=3;
		char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] arr=s1.toCharArray();
		String s2="";
		for(char c:arr) {
			int index=c-'a';
			index+=(en%26);
			s2+=alpha[index%26];
		}
		System.out.println(s2);

	}

}
