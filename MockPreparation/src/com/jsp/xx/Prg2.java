package com.jsp.xx;

import java.util.LinkedList;
import java.util.Queue;

class Node1{
	int ele;
	Node1 left,right;
	public Node1(int ele, Node1 left, Node1 right) {
		super();
		this.ele = ele;
		this.left = left;
		this.right = right;
	}
	public Node1(int ele) {
		super();
		this.ele = ele;
	}
}

class BST{
	private Node1 root;
	private int count;
	private boolean flag;
	public boolean add(int ele) {
		flag=true;
		root=addNode(root,ele);
		return flag;
	}
	private Node1 addNode(Node1 n,int ele) {
		if(n==null) {
			n=new Node1(ele);
			count++;
			return n;
		}
		if(ele<n.ele)n.left=addNode(n.left, ele);
		else if(ele>n.ele)n.right=addNode(n.right, ele);
		else flag=false;
		return n;
	}
	
	public void levelOrder() {
		Queue<Node1> q=new LinkedList<Node1>();
		if(root!=null)q.add(root);
		while(!q.isEmpty()) {
			Node1 n=q.poll();
			System.out.print(n.ele+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
	}
	public void remove(int ele) {
		flag=false;
		root=removeNode(root,ele);
		if(flag)count--;
	}
	private Node1 removeNode(Node1 n,int ele) {
		if(root==null)return n;
		if(ele<n.ele)n.left=removeNode(n.left, ele);
		else if(ele>n.ele)n.right=removeNode(n.right, ele);
		else {
			flag=true;
			if(n.left!=null&&n.right!=null) {
				Node1 t=biggestNode(n.left);
				n.ele=t.ele;
				n.left=removeNode(n.left, t.ele);
			}else if(n.left!=null) {
				n=n.left;
			}
			else if(n.right!=null) {
				n=n.right;
			}
			else {
				n=null;
			}
		}
		return n;
	}
	private Node1 biggestNode(Node1 n) {
		if(n.right==null)return n;
		return biggestNode(n.right);
	}
}

public class Prg2 {

	public static void main(String[] args) {
		BST b=new BST();
		b.add(50);
		b.add(20);
		b.add(60);
		b.add(10);
		b.add(25);
		b.add(55);
		b.add(100);
		b.remove(50);
		b.levelOrder();

	}

}
