package com.jsp.String;

public class Prg28 {

	public static void main(String[] args) {
		String s1="java is easy ";
		char[] ch=s1.toCharArray();
		String s2="";
		for(int i=0;i<ch.length;i++) {
			String temp="";
			while(ch[i]!=' ') {
				temp+=ch[i];
				i++;
			}
			System.out.print(rev(temp)+" ");
			
		}
	}
	public static String rev(String s) {
		int i=0,j=s.length()-1;
		char[] ch=s.toCharArray();
		while(i<j) {
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
			
		}
		return new String(ch);
	}

}
