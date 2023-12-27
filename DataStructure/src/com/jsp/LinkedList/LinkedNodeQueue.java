package com.jsp.LinkedList;

public class LinkedNodeQueue {
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
	public void add(int ele,int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();

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
	
	public int size() {
		return count;
	}
	public void remove(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
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
	public int get(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
//		if(index==0)return first.ele;
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}

	public static void main(String[] args) {
		
		LinkedNodeQueue l=new LinkedNodeQueue();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40, 2);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		l.remove(1);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		
	}

}
