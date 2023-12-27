package com.jsp.practice1;

public class Prg11 {

	public static void main(String[] args) {
		String s1="abc";
		permute(s1,0,s1.length());

	}
	public static void permute(String s1,int start,int end) {
		if(start==end) {
			System.out.println(s1);
			return;
		}
		for(int i=start;i<end;i++) {
			String s2=swap(s1,start,i);
			permute(s2,start+1,end);
		}
		
	}
	private static String swap(String s,int i,int j) {
		char[] a=s.toCharArray();
		char c=a[i];
		a[i]=a[j];
		a[j]=c;
		return new String(a);
	}

}
