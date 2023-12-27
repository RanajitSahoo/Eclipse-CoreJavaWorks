package com.jsp.Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a.addAll(a1);
		a.add(1, 90);
		
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println(a.size());
		System.out.println(a.contains(100));
		System.out.println(a.containsAll(a1));
		System.out.println(a.remove((Integer)90));
//		System.out.println(a.removeAll(a1));
		System.out.println(a.retainAll(a1));
		Object[] arr=a.toArray();
		for(Object n:arr) {
			
			System.out.print((Integer)n+" ");
		}
	}

}
