package com.jsp.Stringday2;

public class Prg4 {

	public static void main(String[] args) {
		String s1="Raja";
		char[] a=s1.toCharArray();
		String s2="";
		int i=0;
		while(i<a.length) {
			if(a[i]=='a') {
				s2+='x';
			}else {
				s2+=a[i];
				
			}
			i++;
		}
		System.out.println(s2);
		System.out.println(replace1("raja"));
	}
	
	public static String replace1(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				s1+="x";
			}else {
				s1+=s.charAt(i);
			}
		}
		return s1;
	}

}
