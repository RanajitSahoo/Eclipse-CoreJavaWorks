package raja.finalmock.Practice;
//class Nod{
//	int ele;
//	Nod next;
//	public Nod(int ele, Nod next) {
//		this.ele = ele;
//		this.next = next;
//	}
//	public Nod(int ele) {
//		this.ele = ele;
//	}
//	
//}
//
//class LL{
//	private Nod first;
//	private int count;
//	
//	public void add(int ele) {
//		if(first==null) {
//			first=new Nod(ele);
//			count++;
//			return;
//		}
//		Nod curr=first;
//		while(curr.next!=null) {
//			curr=curr.next;
//		}
//		curr.next=new Nod(ele);
//		count++;
//	}
//	public int size() {
//		return count;
//	}
//	public int get(int index) {
//		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
//		Nod curr=first;
//		for(int i=0;i<index;i++) {
//			curr=curr.next;
//		}
//		return curr.ele;
//	}
//	public void add(int index,int ele) {
//		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
//		if(index==0) {
//			first=new Nod(ele, first);
//			count++;
//			return;
//		}
//		Nod curr=first;
//		for(int i=1;i<index;i++) {
//			curr=curr.next;
//		}
//		curr.next=new  Nod(ele, curr.next);
//		count++;
//		
//	}
//	public void remove(int index) {
//		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
//		if(index==0) {
//			first=first.next;
//			count--;
//			return;
//		}
//		Nod curr=first;
//		for(int i=1;i<index;i++) {
//			curr=curr.next;
//		}
//		curr.next=curr.next.next;
//		count--;
//		
//	}
//	public void reverse() {
//		Nod prev=null;
//		Nod curr=first;
//		Nod next=null;
//		while(curr!=null) {
//			next=curr.next;
//			curr.next=prev;
//			prev=curr;
//			curr=next;
//		}
//		first=prev;
//	}
//}

class Nod{
	int ele;
	Nod next;
	public Nod(int ele,Nod next) {
		this.ele=ele;
		this.next=next;
	}
	public Nod(int ele) {
		this.ele=ele;
	}
}
class LL{
	private Nod first;
	private int count;
	public void add(int ele) {
		if(first==null) {
			first=new Nod(ele);
			count++;
			return;
		}
		Nod curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Nod(ele);
		count++;
	}
	public int size() {
		return count;
	}
	public int get(int index) {
		if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
		Nod curr=first;
		for(int i=1;i<=index;i++)curr=curr.next;
		return curr.ele;
	}
	public void add(int index,int ele) {
		if(index<=-1||index>size()) throw new IndexOutOfBoundsException();
		if(index == 0) {
			first=new Nod(ele, first);
			count++;
			return;
		}
		Nod curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Nod(ele, curr.next);
		count++;
	}
	
	public void remove(int index) {
		if(index<=-1||index>size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Nod curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void reverse() {
		Nod prev=null,curr=first,next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}

public class Prg5 {

	public static void main(String[] args) {
		LL d=new LL();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(3,40);
//		
		d.reverse();
		d.remove(0);
		for(int i=0;i<d.size();i++) {
			System.out.print(d.get(i)+" ");
		}
		System.out.println();
	}

}
