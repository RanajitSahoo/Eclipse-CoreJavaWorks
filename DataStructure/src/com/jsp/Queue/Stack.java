package com.jsp.Queue;

public class Stack {
	private Node first;
	private int count;
	public void push(Object e) {
		if(first==null) {
			first=new Node(e);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
		
		
	}
	public int size() {
		return count;
	}
	public Object peek() {
		
			return first.ele;
		
		
		
	}
	public Object pop() {
		
		
		Object temp=first.ele;
		 first=first.next;
		count--;
		return temp;
	}
}
