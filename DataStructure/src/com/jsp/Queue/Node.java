package com.jsp.Queue;

public class Node {
	 Object ele;
	Node next;
	Node(Object ele){
		this.ele=ele;
		next=null;
	}
	public Node(Object ele, Node next) {
		this.ele = ele;
		this.next = next;
	}
	

}
