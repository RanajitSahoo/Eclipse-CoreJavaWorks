package com.jsp.String;

public class Encoding {

	public static void main(String[] args) {
		String s="abcxyz";
		int e=3;
		String s2="";
		char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			int index=c-'a';
//			index=-((e%26)-index-26);
			index+=(e%26);
			s2+=alpha[index%26];
			
		}
		System.out.println(s2);

	}

}
