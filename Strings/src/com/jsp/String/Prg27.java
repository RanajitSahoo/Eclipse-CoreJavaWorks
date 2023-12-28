package com.jsp.String;

public class Prg27 {

	public static void main(String[] args) {
		String s1="raJa";
		String s2="Raja";
		System.out.println(equalIgnore(s1, s2));
		

	}
	public static boolean equalIgnore(String s1,String s2) {
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		if(ch1.length==ch2.length) {
			for(int i=0;i<ch1.length;i++) {
				if((ch1[i]>='a'&&ch1[i]<='z')) {
					ch1[i]=ch1[i];
				}else if((ch1[i]>='A'&&ch1[i]<='Z')) {
					ch1[i]=(char)(ch1[i]+32);
				}
				if((ch2[i]>='a'&&ch2[i]<='z')) {
					ch2[i]=ch2[i];
				}else if((ch2[i]>='A'&&ch2[i]<='Z')) {
					ch2[i]=(char)(ch2[i]+32);
				}
				while(i<ch1.length&&(ch1[i]!=ch2[i]))return false;
				
			}
			return true;
		}
		else {
			return false;
		}
	}

}
