package com.jsp.DLinkedlist;

public class Test {

	public static void main(String[] args) {
		DoubleLinkedList d=new DoubleLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40, 0);
		d.add(50,3);
		
		System.out.println(d.size());
		for(int i=0;i<d.size();i++) {
			System.out.print(d.get(i)+" ");
		}
	}

}
