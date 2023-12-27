package com.jsp.Hashset;

public class Hashset {
	private Node[] a=new Node[10];
	private int count;
	public boolean add(Object ele) {
		
		int index=ele.hashCode()%a.length;
		index=Math.abs(index);
		if(a[index]==null) {
			a[index]=new Node(ele);
			count++;
			return true;
		}
		Node curr=a[index];
		while(curr.next!=null) {
			if(curr.key.equals(ele))return false;
			curr=curr.next;
		}
		if(!curr.key.equals(ele))curr.next=new Node(ele);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
			System.out.println();
		}
	}
}
