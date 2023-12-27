package com.jsp.LinkedList;

public class LinkedListStack {
	private Node first;
	private int count;
	
	public void push(int ele) {
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
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public int pop() {
		if(size()>=1) {
			if(size()==1) {
				int n= first.ele;
				first=null;
				count--;
				return n;
			}
			Node prev=null;
			Node curr=first;
			while(curr.next!=null) {
				prev=curr;
				curr=curr.next;
			}
			int n=curr.ele;
			prev.next=null;
			count--;
			return n;
		}else {
			return -1;
		}
		
	}
	public static void main(String[] args) {
		LinkedListStack l=new LinkedListStack();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		System.out.println(l.size());
		System.out.println(l.peek());
		System.out.println(l.pop());
		System.out.println(l.size());
		System.out.println(l.peek());
		l.push(50);
		System.out.println(l.peek());
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.size());
		System.out.println(l.pop());
	}
	
}
