package com.jsp.practice1;

public class CountVowels {

	public static void main(String[] args) {
		String s1="aeiou";
		char[] ch=s1.toCharArray();
		int i=0;
		int count=0;
		while(i<ch.length) {
			if(ch[i]=='a'||
			   ch[i]=='e'||
			   ch[i]=='i'||
			   ch[i]=='o'||
			   ch[i]=='u') count++;
			i++;
		}
		System.out.println(count);

	}

}
