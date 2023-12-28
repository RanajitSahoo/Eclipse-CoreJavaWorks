package com.jsp.Stringday2;

public class Prg1 {

	public static void main(String[] args) {
		String s1="madam";
		char[] a=s1.toLowerCase().toCharArray();
		String s2="";
		for(int i=a.length-1;i>=0;i--) {
			s2+=a[i];
		}
		System.out.println(s2);
		if(s2.equals(s1));
				

	}

}
