package com.jsp.Practice;



public class Prg1 {

	public static void main(String[] args) {
		
		
		System.out.println(convertNumber(56));

	}
	public static String convertNumber(int n) {
		String s1="";
		String s2=n+"";
		System.out.println(s2);
		String s3="";
		for(int i=0;i<s2.length();i++) {
			System.out.println(s2.charAt(i));
			A:switch(s2.charAt(i)) {
			case '1':s3="one";
					break A;
			case '2':s3="two";
					break A;
			case '3':s3="three";
					break A;
			case '4':s3="four";
					break A;
			case '5':s3="five";
					break A;
			case '6':s3="six";
					break A;
			case '7':s3="seven";
					break A;
			case '8':s3="eight";
					break A;
			case '9':s3="nine";
					break A;
			case '0':s3="zero";
					break A;
			
			}
			s1+=s3+" ";
			
			s3="";
			
		}
		return s1;
	}

}
