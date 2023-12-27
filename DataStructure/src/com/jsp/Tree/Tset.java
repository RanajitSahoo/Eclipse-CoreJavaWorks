package com.jsp.Tree;

public class Tset {

	public static void main(String[] args) {
		BST b=new BST();
		b.add(50);
		b.add(30);
		b.add(10);
		b.add(40);
		b.add(80);
		b.add(60);
		b.add(100);
		b.levelOrder();
		b.postOrder();
		b.preOrder();
		b.inOrder();
		b.remove(80);
		b.inOrder();
	}

}
