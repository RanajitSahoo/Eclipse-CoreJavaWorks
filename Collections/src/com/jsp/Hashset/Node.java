package com.jsp.Hashset;

public class Node {
	Object key;
	Node next;
	public Node(Object key) {
		this.key=key;
	}
	public Node(Object key,Node next) {
		this.key=key;
		this.next=next;
	}

}
