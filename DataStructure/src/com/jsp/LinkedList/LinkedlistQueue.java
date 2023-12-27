package com.jsp.LinkedList;

public class LinkedlistQueue {
	
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
		curr.next=new Node(ele,curr.next);
		count++;
	}
	public int size() {
		return count;
	}
	public int peek() {
		return first.ele;
	}
	public int poll() {
		int n=first.ele;
		first=first.next;
		return n;
	}

	public static void main(String[] args) {
		LinkedlistQueue l=new LinkedlistQueue();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l.size());
		System.out.println(l.peek());
		System.out.println(l.poll());
		System.out.println(l.size());
		System.out.println(l.peek());
		

	}

}
