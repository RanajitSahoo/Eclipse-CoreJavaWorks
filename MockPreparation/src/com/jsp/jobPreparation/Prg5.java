package com.jsp.jobPreparation;



class Node3{
	int ele;
	Node3 next;
	public Node3(int ele, Node3 next) {
		this.ele = ele;
		this.next = next;
	}
	public Node3(int ele) {
		this.ele = ele;
	}
}

class SLL{
	private Node3 first;
	private int count;
	
	public void add(int ele) {
		if(first==null) {
			first=new Node3(ele);
			count++;
			return;
		}
		Node3 curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node3(ele);
		count++;
	}
	public int size() {
		return count;
	}
	public int get(int index) {
		if(index<=-1||index>size())throw new IndexOutOfBoundsException();
		Node3 curr=first;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;

	}
	public void add(int index,int ele) {
		if(index<=-1||index>size())throw new IndexOutOfBoundsException();
		if(index==0) {
			first=new Node3(ele);
			count++;
			return;
		}
		Node3 curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node3(ele,curr.next);
		count++;
	}
	public void remove(int index) {
		if(index<=-1||index>size())throw new IndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node3 curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void reverse() {
		Node3 prev=null,curr=first,next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}

public class Prg5 {

	public static void main(String[] args) {
		SLL d=new SLL();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(3,40);
	
		d.reverse();
//		d.remove(0);
		for(int i=0;i<d.size();i++) {
			System.out.print(d.get(i)+" ");
		}
		System.out.println();

	}

}
