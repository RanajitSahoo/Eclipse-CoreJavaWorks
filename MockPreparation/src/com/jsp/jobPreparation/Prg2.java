package com.jsp.jobPreparation;



class Node1{
	int ele;
	Node1 next;
	public Node1(int ele) {
		this.ele = ele;
	}
	public Node1(int ele, Node1 next) {
		this.ele = ele;
		this.next = next;
	}
	
}

class Hasset{
	private Node1[] a=new Node1[10];
	private int count;
	
	public boolean add(int ele) {
		int index=ele%a.length;
		if(a[index]==null) {
			a[index]=new Node1(ele);
			count++;
			return true;
		}
		Node1 curr=a[index];
		while(curr.next!=null) {
			if(ele!=curr.ele)return false;
			curr=curr.next;
		}
		curr.next=new Node1(ele);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node1 curr=a[i];
			while(curr!=null) {
				System.out.print(curr.ele+" ");
				curr=curr.next;
			}
			System.out.println();
		}
	}
}

public class Prg2 {

	public static void main(String[] args) {
		Hasset h=new Hasset();
		h.add(10);
		h.add(10);
		h.add(20);
		h.add(20);
		h.add(20);
		h.add(11);
		h.add(21);
		h.add(25);
		h.add(305);
		h.add(29);
		h.add(39999);
		h.display();

	}

}
