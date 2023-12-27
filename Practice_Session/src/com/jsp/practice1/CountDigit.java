package com.jsp.practice1;

public class CountDigit {

	public static void main(String[] args) {
		String s1="b1an374dnan7d8";
//		String s2=s1.replaceAll("[0-9]", "");
//		System.out.println(s1.length()-s2.length());
		char[] ch=s1.toCharArray();
		int i=0;
		int count=0;
		while(i<ch.length) {
			if(ch[i]>='0'&&ch[i]<='9') count++;
			i++;
		}
		System.out.println(count);
		

	}

}
