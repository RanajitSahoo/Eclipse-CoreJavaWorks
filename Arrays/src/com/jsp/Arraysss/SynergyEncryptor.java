package com.jsp.Arraysss;

public class SynergyEncryptor {

	public static void main(String[] args) {
		String s1="xyz";
		int key=2;
		char[] alphabates="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] ch=s1.toCharArray();
		String s2="";
		for(char c:ch) {
			int index=c-'a';
			index+=(key%26);
			s2+=alphabates[index%26];
		}
		System.out.println(s2);

	}

}
