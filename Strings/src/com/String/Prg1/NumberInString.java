package com.String.Prg1;

import java.util.Scanner;

public class NumberInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String s1=s.nextLine();
		int cn=0;
		while(s1.length()>0) {
			char c=s1.charAt(0);
			String s2="";
			
			if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||
					c=='6'||c=='7'||c=='8'||c=='9'||c=='0') {
				
				s2=s1.replace(c+"", "");
				
				int count=s1.length()-s2.length();

				System.out.println(c+" = "+count);
			}else{
				s2=s1.replace(c+"", "");
			}
			s1=s2;
		}
		

	}

}
