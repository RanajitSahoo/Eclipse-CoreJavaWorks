package raja.mock.Practice;
class Node11{
	int ele;
	Node11 prev,next;
	public Node11(int ele) {
		this.ele = ele;
	}
	public Node11(int ele, Node11 prev, Node11 next) {
		this.ele = ele;
		this.prev = prev;
		this.next = next;
	}
	
}
public class DLL {
	private Node11 first;
	private int count;
	public void add(int ele) {
		if(first==null) {
			first=new Node11(ele);
			count++;
			return;
		}
		Node11 curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		Node11 n=new Node11(ele, curr, null);
		curr.next=n;
		count++;
	}
	public void add(int ele,int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			Node11 n=new Node11(ele, null, first);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		
		Node11 curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node11 n=new Node11(ele, curr, curr.next);
		curr.next=n;
		n.next.prev=n;
		
		count++;
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
		Node11 n=first;
		for(int i=1;i<index;i++) {
			n=n.next;
		}
		n.next=n.next.next;
		if(n.next!=null)n.next.prev=n;
		count--;
	}
	public int size() {
		return count;
	}
	public int get(int index) {
		Node11 curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public static void main(String[] args) {
		DLL d=new DLL();
		d.add(10);
		d.add(20);
		d.add(30);
		
		d.add(22,0);
		d.remove(4);
		for(int i=0;i<d.size();i++) {
			System.out.println(d.get(i));
		}

	}

}
