package com.jsp.String22222;

public class Prg1 {

	public static void main(String[] args) {
		String s1="java is easy";
		char[] c=s1.toCharArray();
		String s2="";
		int i=0;
		int j=0;
		
		while(i<c.length) {
			while(j<c.length && c[j]!=' ') 
				j++;
				int k=j-1;
				String temp="";
				while(k>=i) {
					temp+=c[k];
					k--;
				}
				s2+=temp;
				
				if(j<c.length) 
					s2+=" ";
				
				j++;
				i=j;
				
			
			
		}
		System.out.print(s2);

	}

}
