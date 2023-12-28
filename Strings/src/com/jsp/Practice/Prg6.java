package com.jsp.Practice;

public class Prg6 {

	public static void main(String[] args) {
		String s1="fusion";
		String s2="";
		char[] a=s1.toCharArray();
		for(int i=0;i<a.length-1;i++) {
			if((a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')&&(a[i+1]=='a'||a[i+1]=='e'||a[i+1]=='i'||a[i+1]=='o'||a[i+1]=='u')) {
				s2+=""+a[i]+a[i+1];
			}
		}
		System.out.println(s2);

	}

}
