package raja.mock.Practice;
class Node112{
	Object ele;
	Node112 next;
	public Node112(Object ele) {
		this.ele = ele;
	}
	public Node112(Object ele, Node112 next) {
		this.ele = ele;
		this.next = next;
	}
	
}
class LL{
	private Node112 first;
	private int count;
	public void add(int ele) {
		if(first==null) {
			first=new Node112(ele);
			count++;
			return;
		}
		Node112 curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node112(ele,curr.next);
		count++;
	}
	public int size() {
		return count;
	}
	public Object get(int index) {
		Node112 curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int ele,int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		if(index==0) {
			first=new Node112(ele,first);
			count++;
			return;
		}
		Node112 curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node112(ele, curr.next);
		count++;
	}
	
	public void remove(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node112 curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
}

public class Prg17 {

	public static void main(String[] args) {
		
		LL l=new LL();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40, 2);
		l.remove(3);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
	}

}
