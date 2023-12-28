package com.jsp.Stringday2;

public class Prg2 {

	public static void main(String[] args) {
		String s1="madam";
		
		if(isPal(s1))System.out.println("palindrome");
		else System.out.println("not");
	}
	
	public static boolean isPal(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}

}
