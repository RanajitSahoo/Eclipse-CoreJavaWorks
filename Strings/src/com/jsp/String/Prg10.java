package com.jsp.String;

public class Prg10 {

	public static void main(String[] args) {
		String s1="java42 is24 very34 ea1sy24";
		char[] ch=s1.toCharArray();
		int i=0;
		int j=0;
		int rev=0,sum=0;
		while(i<ch.length) {
			while(j<ch.length&&ch[j]!=' ') {
				if(ch[j]>='0'&&ch[j]<='9') {
					
					int num=ch[j]-'0';
					
					rev=rev*10+num;
					
				}else {
					
					if(rev!=0) {
						System.out.println(rev);
						sum+=rev;
						rev=0;
					}
				}
				j++;
			}
			j++;
			i=j;
			
		}
		System.out.println(sum);
		

	}

}
