package BST;

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
		else if(ele>root.ele)root.right=addNode(root.right, ele);
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
	}
	
	public void remove(int ele) {
		flag=false;
		root=removeNode(root,ele);
		if(flag)count--;
	}
	private Node removeNode(Node n,int ele) {
		if(n==null)return n;
		if(ele<n.ele)n.left=removeNode(n.left, ele);
		else if(ele>n.ele)n.right=removeNode(n.right, ele);
		else {
			flag=true;
			if(n.left!=null&&n.right!=null) {
				Node temp=getBiggestNode(n.left);
				n.ele=temp.ele;
				n.left=removeNode(n.left, temp.ele);
			}
			else if(n.left!=null)n=n.left;
			else if(n.right!=null)n=n.right;
			else n=null;
		}
		return n;
	}
	private Node getBiggestNode(Node n) {
		if(n.right==null)return n;
		return getBiggestNode(n.right);
	}
	
}
