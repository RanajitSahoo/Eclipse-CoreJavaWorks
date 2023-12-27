package com.jsp.DLinkedlist;

public class QueueDL {
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
	public int size() {
		return count;
	}
	public int peek() {
	
		return first.ele;
	}
	public int poll() {
		int n=first.ele;
		first=first.next;
		first.prev=null;
		return n;
	}
	public static void main(String[] args) {
		QueueDL q=new QueueDL();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());

	}
}
