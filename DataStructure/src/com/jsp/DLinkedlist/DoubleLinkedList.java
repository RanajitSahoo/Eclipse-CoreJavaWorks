package com.jsp.DLinkedlist;

public class DoubleLinkedList {
	private Node first;
	private int count;
	
	public void add(int ele) {
		if(first==null) {
			first=new Node(ele);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(ele,curr,null);
		count++;
	}
	public void add(int ele,int index) {
		if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			Node n=new Node(ele,null,first);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(ele,curr,curr.next);
		curr.next.next.prev=curr.next;
		count++;
	}
	
	public void remove(int index) {
		if(index<=-1||index>=size())new IndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			first.prev=null;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next!=null)curr.next.prev=curr;
		count--;

	}
	
	public int size() {
		return count;
	}
	public int get(int index) {
		if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
}
