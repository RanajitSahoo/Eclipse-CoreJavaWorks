package com.jsp.xx;
class Node{
	int ele;
	Node next,prev;
	
	public Node(int ele) {
		this.ele=ele;
	}
	
	public Node(int ele,Node prev,Node next) {
		this.ele=ele;
		this.prev=prev;
		this.next=next;
	}
}

class Dll{
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
		curr.next=new Node(ele, curr,null);
		count++;
	}
	public int size() {
		return count;
	}
	public int get(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int index,int ele) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		if(index==0) {
			Node n=new Node(ele, null, first);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node n=new Node(ele, curr, curr.next);
		curr.next=n;
		n.next.prev=n;
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
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next!=null)curr.next.prev=curr;
		count--;
	}
}

public class Prg1 {

	public static void main(String[] args) {
		Dll d=new Dll();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.remove(3);
		for(int i=0;i<d.size();i++) {
			System.out.print(d.get(i)+" ");
		}

	}

}
