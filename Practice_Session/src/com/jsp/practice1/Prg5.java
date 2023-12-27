package com.jsp.practice1;

public class Prg5 {

	public static void main(String[] args) {
		String s1="madam";
		if(isPalin(s1))System.out.println("String is palindrome");
		else System.out.println("not palindrome");

	}
	public static boolean isPalin(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
