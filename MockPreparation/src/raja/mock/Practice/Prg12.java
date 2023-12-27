package raja.mock.Practice;
class Node{
	int ele;
	Node prev,next;
	Node(int ele){
		this.ele=ele;
	}
	Node(int e,Node n,Node p){
		this.ele=e;
		this.prev=p;
		this.next=n;
	}
}
class DL{
	private Node first;
	private int count;
	public void add(int ele) {
		if(first==null) {
			first=new Node(ele);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(ele,null,curr.next);
		curr.next.prev=curr.next;
		count++;
	}
	public void add(int ele,int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			Node n=new Node(ele,first,null);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node n=new Node(ele,curr.next,curr);
		curr.next=n;
		n.next.prev=n;
		count++;
	}
	public int size() {
		return count;
	}
	public int get(int index) {
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			first.prev=null;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next!=null)curr.next.prev=curr;
		count--;
	}
}
public class Prg12 {
	

	public static void main(String[] args) {
		DL d=new DL();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50,2);
		d.remove(4);
		System.out.println(d.size());
		for(int i=0;i<d.size();i++) {
			System.out.print(d.get(i)+" ");
		}
	}

}
