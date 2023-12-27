package com.jsp.DLinkedlist;

public class Node {

	int ele;
	Node prev,next;
	
	Node(int ele){
		this.ele=ele;
	}
	Node(int ele,Node prev,Node next){
		this.ele=ele;
		this.prev=prev;
		this.next=next;
	}

}
