package raja.mock.Practice;

import java.util.LinkedList;
import java.util.Queue;

class Nod{
	int ele;
	Nod left,right;
	public Nod(int ele, Nod left, Nod right) {
		this.ele = ele;
		this.left = left;
		this.right = right;
	}
	public Nod(int ele) {
		this.ele = ele;
	}
}
class BinST{
	private Nod root;
	private int count;
	private boolean flag;
	public boolean add(int ele) {
		flag=true;
		root=addNode(root,ele);
		return flag;
	}
	private  Nod addNode(Nod root,int ele) {
		if(root==null) {
			root=new Nod(ele);
			count++;
			return root;
		}
		if(ele<root.ele)root.left=addNode(root.left, ele);
		if(ele>root.ele)root.right=addNode(root.right, ele);
		else flag=false;
		return root;
	}
	public void levelOrder() {
		Queue<Nod> q=new LinkedList<Nod>();
		if(root!=null)q.add(root);
		while(!q.isEmpty()) {
			Nod n=q.poll();
			System.out.print(n.ele+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		System.out.println();
	}
	public void inOrder() {
		inOrderT(root);
	}
	private void inOrderT(Nod root) {
		if(root==null)return;
		inOrderT(root.left);
		System.out.print(root.ele+" ");
		inOrderT(root.right);
	}
	public void remove(int ele) {
		flag=false;
		root=removeNode(root,ele);
		if(flag)count--;
	}
	private Nod removeNode(Nod root,int ele) {
		if(root==null)return root;
		if(ele<root.ele)root.left=removeNode(root.left, ele);
		if(ele>root.ele)root.right=removeNode(root.right, ele);
		else {
			if(root.left!=null&&root.right!=null) {
				Nod temp=BiggestNode(root);
				root.ele=temp.ele;
				root.left=removeNode(root.left, temp.ele);
			}
			else if(root.left!=null) {
				root=root.left;
			}
			else if(root.right!=null) {
				root=root.right;
			}
			else root=null;
		}
		return root;
	}
	private Nod BiggestNode(Nod n) {
		if(n.right==null)return n;
		return BiggestNode(n.right);
	}
}

public class Prg20 {

	public static void main(String[] args) {
		BinST b=new BinST();
		b.add(10);
		b.add(5);
		b.add(20);
		b.add(15);
		b.add(7);
		b.levelOrder();
		b.inOrder();
	}

}
