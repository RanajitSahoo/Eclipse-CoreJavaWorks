package com.jsp.String;

public class Prg32 {

	public static void main(String[] args) {
		String s1="abc";
		int cypher=2;
		String s2=encoding(s1, cypher);
		System.out.println(s2);
		String s3=decoding(s2, cypher);
		System.out.println(s3);
		if(s1.equals(s3))System.out.println("success");
		else System.out.println("failuer");

	}
	public static String decoding(String s1,int de) {
		char[] alp="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] arr=s1.toCharArray();
		String s2="";
		for(char c:arr) {
			int index=c-'a';
			index=-((de%26)-index-26);
			s2+=alp[index%26];
		}
		
		return s2;
	}
	public static String encoding(String s1,int en) {
		char[] alp="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] arr=s1.toCharArray();
		String s2="";
		for(char c:arr) {
			int index=c-'a';
			index+=en%26;
			s2+=alp[index%26];
		}
		
		return s2;
	}

}
