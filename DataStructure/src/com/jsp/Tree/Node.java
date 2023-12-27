package com.jsp.Tree;

public class Node {
	int ele;
	Node left;
	Node right;
	public Node(int ele) {
		this.ele = ele;
	}
	public Node(int ele, Node left, Node right) {
		this.ele = ele;
		this.left = left;
		this.right = right;
	}
	

}
