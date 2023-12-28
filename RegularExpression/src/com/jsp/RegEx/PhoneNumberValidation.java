package com.jsp.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter your phone number to check its valid or not");
		String ph="775100644";
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher m=p.matcher(ph);
		if(m.matches())System.out.println("Valid");
		else System.err.println("not valid");

	}

}
