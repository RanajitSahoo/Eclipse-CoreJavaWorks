package raja.finalmock.Practice;

import java.util.LinkedList;
import java.util.Queue;

//class Node{
//	int ele;
//	Node left,right;
//	public Node(int ele) {
//		this.ele = ele;
//	}
//	public Node(int ele, Node left, Node right) {
//		this.ele = ele;
//		this.left = left;
//		this.right = right;
//	}
//	
//	
//	
//}
//
//class BST{
//	private Node root;
//	private int count;
//	private boolean flag;
//	public boolean add(int k) {
//		flag=true;
//		root=addNode(root, k);
//		return flag;
//	}
//	private Node addNode(Node n,int k) {
//		if(n==null) {
//			n=new Node(k);
//			count++;
//			return n;
//		}
//		if(k<n.ele)n.left=addNode(n.left, k);
//		else if(k>n.ele)n.right=addNode(n.right, k);
//		else flag=false;
//		return n;
//	}
//	public int size() {
//		return count;
//	}
//	
//	public void levelOrder() {
//		Queue<Node> q=new LinkedList<Node>();
//		if(root!=null)q.add(root);
//		while(!q.isEmpty()) {
//			Node n=q.poll();
//			System.out.print(n.ele+" ");
//			if(n.left!=null)q.add(n.left);
//			if(n.right!=null)q.add(n.right);
//		}
//		System.out.println();
//	}
//	public void preOrder() {
//		preOrdT(root);
//		System.out.println();
//	}
//	private void preOrdT(Node root) {
//		if(root==null)return;
//		System.out.print(root.ele+" ");
//		preOrdT(root.left);
//		preOrdT(root.right);
//	}
//	
//	public void inOrder() {
//		iOT(root);
//		System.out.println();
//	}
//	private void iOT(Node root) {
//		if(root==null)return;
//		iOT(root.left);
//		System.out.print(root.ele+" ");
//		iOT(root.right);
//	}
//	public void postOrder() {
//		postOT(root);
//		System.out.println();
//	}
//	private void postOT(Node root) {
//		if(root==null)return;
//		postOT(root.left);
//		
//		postOT(root.right);
//		System.out.print(root.ele+" ");
//	}
//	public void remove(int k) {
//		flag=false;
//		root=removeNode(root, k);
//		if(flag)count--;
//	}
//	private Node removeNode(Node n,int k) {
//		if(n==null)return n;
//		if(k<n.ele)n.left=removeNode(n.left, k);
//		else if(k>n.ele)n.right=removeNode(n.right, k);
//		else {
//			flag=true;
//			if(n.left!=null&&n.right!=null) {
//				Node temp=biggestNode(n.left);
//				n.ele=temp.ele;
//				n.left=removeNode(n.left, temp.ele);
//			}else if(n.left!=null)n=n.left;
//			else if(n.right!=null)n=n.right;
//			else n=null;
//		}
//		return n;
//	}
//	private Node biggestNode(Node n) {
//		if(n.right==null)return n;
//		return biggestNode(n.right);
//	}
//}

class Node {
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

class BST {
	private Node root;
	private int count;
	private boolean flag;

	public boolean add(int ele) {
		flag = true;
		root = addNode(root, ele);
		return flag;
	}

	private Node addNode(Node root, int ele) {
		if (root == null) {
			root = new Node(ele);
			count++;
			return root;
		}
		if (ele < root.ele)
			root.left = addNode(root.left, ele);
		else if (ele > root.ele)
			root.right = addNode(root.right, ele);
		else
			flag = false;
		return root;
	}

	public int size() {
		return count;
	}

	public void levelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		if (root != null)
			q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(n.ele + " ");
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
		System.out.println();
	}

	public void inOrder() {
		iot(root);
		System.out.println();
	}

	private void iot(Node root) {
		if (root == null)
			return;
		iot(root.left);
		System.out.print(root.ele + " ");
		iot(root.right);

	}

	public void preOrder() {
		pot(root);
		System.out.println();
	}

	private void pot(Node root) {
		if (root == null)
			return;
		System.out.print(root.ele + " ");
		pot(root.left);
		pot(root.right);
	}

	public void postOrder() {
		poot(root);
		System.out.println();
	}

	private void poot(Node root) {
		if (root == null)
			return;
		poot(root.left);
		poot(root.right);
		System.out.print(root.ele + " ");
	}

	public void remove(int ele) {
		flag = false;
		root = removeNode(root, ele);
		if (flag)
			count--;
	}

	private Node removeNode(Node root, int ele) {
		if (root == null)
			return root;
		if (ele < root.ele)
			root.left = removeNode(root.left, ele);
		else if (ele > root.ele)
			root.right = removeNode(root.right, ele);
		else {
			flag = true;
			if (root.left != null && root.right != null) {
				Node temp = getBiggestNode(root.left);
				root.ele = temp.ele;
				root.left = removeNode(root.left, temp.ele);
			} else if (root.left != null)
				root = root.left;
			else if (root.right != null)
				root = root.right;
			else
				root = null;

		}
		return root;
	}

	private Node getBiggestNode(Node root) {
		if (root.right == null)
			return root;
		return getBiggestNode(root.right);
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
		b.inOrder();
		b.remove(45);
		b.preOrder();
		System.out.println(b.size());
		b.postOrder();

	}

}
