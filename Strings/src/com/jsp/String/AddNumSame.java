package com.jsp.String;

public class AddNumSame {

	public static void main(String[] args) {
		String s="a1b2c9d2c1d2";
		char[] ch=s.toCharArray();
		int i=0;
		String s1="";
		String s2="";
		int sum=0;
		while(i<ch.length-1) {
			int j=i+1;
			while(j<ch.length) {
				if(ch[i]==ch[j]) {
					if((ch[j]>='a'&&ch[j]<='z')) {
						
						sum+=Integer.parseInt(ch[i+1]+"");
						sum+=Integer.parseInt(ch[j+1]+"");
						s1+=ch[i]+""+sum;
					}
				}
				sum=0;
				j++;
			}
			i++;
		}
		i=0;
		while(i<ch.length) {
			if(ch[i]=='c'||ch[i]=='d'&&(ch[i+1]>='0'&&ch[i+1]<='9')) {
				s2+="";
				i++;
			}else {
				s2+=ch[i];
			}
			i++;
		}
		System.out.println(s2+s1);
		

	}

}
