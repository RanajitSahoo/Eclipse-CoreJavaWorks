package com.jsp.String;

public class Prg9 {

	public static void main(String[] args) {
		String s1="Java is very easy";
		char[] ch=s1.toCharArray();
		String[] s3= new String[4];
		int l=0;
		for(int i=0;i<s1.length();i++) {
			int j=i;
			while(j<ch.length&&ch[j]!=' ')j++;
			int k=j-1;
			String s2="";
			while(i<=k) {
				s2+=ch[i];
				i++;
			}
			s3[l]=s2 ;
			i=j;
			l++;
		}
		for(String s:s3) {
			System.out.println(s);
		}
	}

}
