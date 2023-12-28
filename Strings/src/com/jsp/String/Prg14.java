package com.jsp.String;

public class Prg14 {

	public static void main(String[] args) {
		String s1="java is easyy";
		String[] s2=s1.split(" ");
		String s3="";
		for(String s:s2) {
			s3+=rev(s)+" ";
		}
		System.out.println(s3);

	}
	public static String rev(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}

}
