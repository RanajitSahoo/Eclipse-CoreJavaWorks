package com.jsp.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(20);
		s.add(10);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(30);
		s.add(90);
		s.add(80);
		display(s);
		System.out.println("smallest-->"+s.first());
		System.out.println("biggest-->"+s.last());
		SortedSet s1=s.headSet(40);
		display(s1);
		SortedSet s2=s.tailSet(30);
		display(s2);
		SortedSet s3=s.subSet(30, 80);
		display(s3);

	}
	public static void display(SortedSet s) {
		for(Object o:s) {
			System.out.print(o+" ");
		}
		System.out.println();
	}

}
