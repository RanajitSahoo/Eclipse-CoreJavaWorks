package com.jsp.String;

public class Prg11 {

	public static void main(String[] args) {
		String s1="1java12 en1gth12 eh12";
		String[] s2=s1.split(" ");
		int sum=0;
		for(int i=0;i<s2.length;i++) {
			sum+=numb(s2[i]);	
		}
		System.out.println(sum);
		;
	}
	public static int numb(String s) {
		
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			int num=0;
			while(i<ch.length&&(ch[i]>='0'&&ch[i]<='9')) {
				num=num*10+(ch[i]-'0');
				i++;
			}
			sum+=num;
		}
		return sum;
		
		
	}

}
