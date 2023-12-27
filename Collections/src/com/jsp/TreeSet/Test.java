package com.jsp.TreeSet;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree t=new BinarySearchTree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(40);
		t.add(80);
		t.add(60);
		t.add(100);
		t.add(5);
		t.levelOrder();
		t.postOrderTaverse();
		t.preOrderTaverse();
		t.inOrderTaverse();
		t.remove(50);
		t.inOrderTaverse();
	}

}
