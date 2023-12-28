package com.jsp.String;

public class Prg1 {

	public static void main(String[] args) {
		String s1="java is easy";
		char[] ch=s1.toCharArray();
		int i=ch.length-1;
		int j=ch.length-1;
		String s2="";
		while(i>=0) {
			while(j>=0&& ch[j]!=' ')
				j--;
			int k=j+1;
			String temp="";
			while(k<=i) {
				temp+=ch[k];
				k++;
			}
			s2+=temp;
			s2+=" ";
			j--;
			i=j;
			
		}
		System.out.println(s2);
	}

}
