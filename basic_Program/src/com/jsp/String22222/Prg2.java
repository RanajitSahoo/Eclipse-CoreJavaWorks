package com.jsp.String22222;

public class Prg2 {

	public static void main(String[] args) {
		String s="Java is easy";
		char[] c=s.toCharArray();
		
		int j=0;
		for(int i=0;i<c.length;i++)
		
		{
			if(i==0&&c[i]!=' ') {
				if(c[i]>='a'&&c[j]<='z') {
					c[i]=(char)(c[i]-32);
				}
			}
				
			
				
		}
		System.out.println(new String(c));
			

	}

}
