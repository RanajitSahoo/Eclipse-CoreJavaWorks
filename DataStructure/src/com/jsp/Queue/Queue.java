package com.jsp.Queue;

public class Queue {

	private Node first;
	private int count;
	public void add(Object e) {
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
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public Object peek() {
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public Object poll() {
		if(size()==1) {
			Object temp=first.ele;
			first=null;
			count--;
			return temp;
		}
		Node prev=first;
		Node curr=first.next;
		while(curr.next!=null) {
			prev=curr;
			curr=curr.next;
		}
		Object temp=curr.ele;
		prev.next=null;
		count--;
		return temp;
		
	}

}
