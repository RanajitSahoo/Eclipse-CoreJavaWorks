package com.jsp.String;

public class Prg29 {

	public static void main(String[] args) {
		String s1="abc";
		permute(s1, 0, s1.length());

	}
	public static void permute(String s1,int start,int end) {
		if(start==end) {
			System.out.println(s1);
		}
		for(int i=start;i<end;i++) {
			String s2=swap(s1, start, i);
			permute(s2, start+1, end);
		}
	}
	
	public static String swap(String s,int i,int j) {
		char[] ch=s.toCharArray();
		char c=ch[i];
		ch[i]=ch[j];
		ch[j]=c;
		return new String(ch);
	}

}
