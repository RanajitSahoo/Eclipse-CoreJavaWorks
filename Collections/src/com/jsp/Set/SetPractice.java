package com.jsp.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("java");
		s.add("python");
		s.add("c");
		s.add("qavaScript");
		s.add("sql");
		for(Object o:s) {
			System.out.println(o);
		}
		
		Set s3=new LinkedHashSet();
		s3.add("java");
		s3.add("python");
		s3.add("c");
		s3.add("javaScript");
		s3.add("sql");
		System.out.println("----------------"+s.size());

		for(Object o:s3) {
			System.out.println(o);
		}
	}

}
