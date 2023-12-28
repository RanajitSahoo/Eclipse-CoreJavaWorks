package com.String.Prg1;

import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1="aakleeaesldo  kaiiidaDuuuLCJaSLKjkdlsiou";
		while(s1.length()>0) {
			char c=s1.charAt(0);
			String s2="";
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				s2=s1.replace(c+"", "");
				int count=s1.length()-s2.length();
				System.out.println(c+"="+count);
			}else {
				s2=s1.replace(c+"", "");
			}
			s1=s2;
		}

	}

}
