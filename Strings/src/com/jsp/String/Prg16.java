package com.jsp.String;

public class Prg16 {

	public static void main(String[] args) {
		String s1="Madam";
		if(isPalin(s1)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");

	}
	
	public static boolean isPalin(String s) {
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) return false;
			i++;
			j--;
		}
		return true;
		
	}

}
