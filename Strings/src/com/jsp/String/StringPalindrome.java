package com.jsp.String;

public class StringPalindrome {

	public static void main(String[] args) {
		if(isPalindrome("Malayalam"))System.out.println("Palindrome");
		else System.out.println("not Palindrome");

	}
	
	public static boolean isPalindrome(String s) {
		char[] c=s.toLowerCase().toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
			if(c[i]!=c[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
