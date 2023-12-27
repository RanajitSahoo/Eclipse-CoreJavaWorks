package com.jsp.jobPreparation;



class Node2{
	int ele;
	Node2 prev,next;
	public Node2(int ele) {
		this.ele = ele;
	}
	public Node2(int ele, Node2 prev, Node2 next) {
		this.ele = ele;
		this.prev = prev;
		this.next = next;
	}
	
}

class DLL{
	private Node2 first;
	private int count;
	
	public void add(int ele) {
		if(first==null) {
			first=new Node2(ele);
			count++;
			return;
		}
		Node2 curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node2(ele, curr, null);
		count++;
	}
	public int size() {
		return count;
	}
	public int get(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		Node2 curr=first;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	
	public void add(int index,int ele) {
		if(index<=-1||index>size())throw new IndexOutOfBoundsException();
		if(index==0) {
			Node2 n=new Node2(ele, null, first);
			first=n;
			count++;
			return;
		}
		Node2 curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node2 n=new Node2(ele, curr, curr.next);
		curr.next.prev=n;
		curr.next=n;
		count++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			first.prev=null;
			count--;
			return;
		}
		Node2 curr=first;
		for(int i=1;i<index;i++)curr=curr.next;
		curr.next=curr.next.next;
		if(curr.next!=null)curr.next.prev=curr;
		count--;

	}
}

public class Prg4 {

	public static void main(String[] args) {
		DLL d=new DLL();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.remove(3);
		for(int i=0;i<d.size();i++) {
			System.out.print(d.get(i)+" ");
		}
		System.out.println();

	}

}
