package com.jsp.xx;

public class Prg4 {

	public static void main(String[] args) {
		permute("abc",0,3);

	}
	public static void permute(String s,int start,int end) {
		if(start==end) {
			System.out.println(s);
			return;
		}
		for(int i=start;i<end;i++) {
			String s1=swap(s,start,i);
			permute(s1, start+1, end);
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
