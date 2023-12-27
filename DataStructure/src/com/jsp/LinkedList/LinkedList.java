package com.jsp.LinkedList;

public class LinkedList {
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
		curr.next=new Node(ele);
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
	public void add(int ele,int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=new Node(ele,first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(ele,curr.next);
		count++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
		
	}
	public void reverse() {
		Node prev=null;
		Node curr=first;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	public static void main(String...a) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l.add(40,1);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l.remove(1);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		l.add(50);
		l.reverse();
		System.out.println();
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		
	}
}
