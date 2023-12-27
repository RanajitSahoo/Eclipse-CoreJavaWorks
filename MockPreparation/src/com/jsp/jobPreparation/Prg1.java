package com.jsp.jobPreparation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int ele;
	Node left,right;
	public Node(int ele) {
		this.ele=ele;
	}
	public Node(int ele,Node left,Node right) {
		this.ele=ele;
		this.left=left;
		this.right=right;
	}
}

class BST{
	private Node root;
	private int  count;
	private boolean flag;
	
	public boolean add(int ele) {
		flag=true;
		root=addNode(ele,root);
		return flag;
	}

	private Node addNode(int ele, Node root) {
		if(root==null) {
			root=new Node(ele);
			count++;
			return root;
		}
		if(ele<root.ele)root.left=addNode(ele, root.left);
		else if(ele>root.ele)root.right=addNode(ele,root.right);
		else flag=false;
		
		return root;
	}
	public int size() {
		return count;
	}
	public void levelOrder() {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.ele+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		System.out.println();
	}
	public void preOrder() {
		preOrderTraverse(root);
		System.out.println();
	}
	private void preOrderTraverse(Node root) {
		if(root==null) return;
		
		System.out.print(root.ele+" ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
	
	public void inOrder() {
		inOrderTraverse(root);
		System.out.println();
	}
	private void inOrderTraverse(Node root) {
		if(root==null) return;
		
		
		inOrderTraverse(root.left);
		System.out.print(root.ele+" ");
		inOrderTraverse(root.right);
	}
	public void postOrder() {
		postOrderTraverse(root);
		System.out.println();
	}
	private void postOrderTraverse(Node root) {
		if(root==null) return;
		
		
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		System.out.print(root.ele+" ");
	}
	
	public void remove(int ele) {
		flag=false;
		root=removeNode(root,ele);
		if(flag)count--;
	}

	private Node removeNode(Node root, int ele) {
		if(root==null)return root;
		if(ele<root.ele)root.left=removeNode(root.left,ele);
		else if(ele>root.ele)root.right=removeNode(root.right,ele);
		else {
			flag=true;
			if(root.left!=null&&root.right!=null) {
				Node t=getBiggestNode(root.left);
				root.ele=t.ele;
				root.left=removeNode(root.left, t.ele);
			}else if(root.left!=null)root=root.left;
			else if(root.right!=null)root=root.right;
			else root=null;
		}
		return root;
	}

	private Node getBiggestNode(Node left) {
		if(left.right==null)return left;
		
		return getBiggestNode(left.left);
	}
	
}

public class Prg1 {

	public static void main(String[] args) {
		BST b = new BST();
		b.add(50);
		b.add(40);
		b.add(60);
		b.add(30);
		b.add(70);
		b.add(20);
		b.add(10);
		b.add(55);
		b.add(45);
		b.add(46);
		System.out.println(b.size());
		b.levelOrder();
		b.preOrder();
		b.inOrder();
		b.postOrder();
		b.remove(45);
		System.out.println(b.size());
		b.levelOrder();
		b.preOrder();
		b.inOrder();
		b.postOrder();

	}

}
