package com.jsp.TreeSet;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Node root;
	private int count;
	private boolean flag;
	public boolean add(int key) {
		flag=true;
		root=addNode(root,key);
		return flag;
	}
	
	private Node addNode(Node n,int key) {
		if(n==null) {
			n=new Node(key);
			count++;
			return n;
		}
		if(key<n.key)n.left=addNode(n.left,key);
		if(key>n.key)n.right=addNode(n.right,key);
		else flag=false;
		return n;
	}
	
	public void levelOrder() {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		System.out.println();
	}
	
	public void postOrderTaverse() {
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node n) {
		if(n==null)return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void preOrderTaverse() {
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node n) {
		if(n==null)return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
		
	}
	public void inOrderTaverse() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node n) {
		if(n==null)return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
		
	}
	
	public void remove(int val) {
		
	}
	
	
	
}
