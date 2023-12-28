package com.jsp.String;

public class Prg12 {

	public static void main(String[] args) {
		String s="abcxyz";
		int en=1;
		String s2="";
		char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			int index=c-'a';
			index=index+(en%26);
			s2+=alpha[index%26];
		}
		System.out.println(s2);

	}

}
