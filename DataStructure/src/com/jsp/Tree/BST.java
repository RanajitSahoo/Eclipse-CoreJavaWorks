package com.jsp.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	private Node root;
	private int count;
	private boolean flag;
	public boolean add(int ele) {
		flag=true;
		root=addNode(root,ele);
		return flag;
	}
	private Node addNode(Node root,int ele) {
		if(root==null) {
			root=new Node(ele);
			count++;
			return root;
		}
		if(ele<root.ele)root.left=addNode(root.left, ele);
		else if(ele>root.ele)root.right=addNode(root.right,ele);
		else flag=false;
		return root;
		
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
	public void preOrder() {
		preOrderTraverse(root);
		System.out.println();
	}
	private void preOrderTraverse(Node root) {
		if(root==null)return;
		System.out.print(root.ele+" ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
		
	}
	public void inOrder() {
		inOrderTraverse(root);
		System.out.println();
	}
	private void inOrderTraverse(Node root) {
		if(root==null)return;
		inOrderTraverse(root.left);
		System.out.print(root.ele+" ");
		inOrderTraverse(root.right);
	}
	
	public void remove(int key) {
		root=removeNode(root,key);
	}
	private Node removeNode(Node root,int key) {
		if(root==null)return null;
		if(key<root.ele)root.left=removeNode(root.left, key);
		else if(key>root.ele)root.right=removeNode(root.right,key);
		else {
			if(root.left!=null&&root.right!=null) {
				Node temp=getBiggestNode(root.left);
				root.ele=temp.ele;
				root.left=removeNode(root.left,temp.ele);
			}
			else if(root.left!=null) {
				root=root.left;
			}
			else if(root.right!=null) {
				root=root.right;
			}
			else {
				root=null;
			}
			
		}
		return root;
	}
	private Node getBiggestNode(Node root) {
		if(root.right==null)return root;
		return getBiggestNode(root);
	}
	
}
