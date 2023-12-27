package raja.mock.Practice;

class Nodde{
	int  ele;
	Nodde next;
	public Nodde(int ele) {
		this.ele = ele;
	}
	public Nodde(int ele, Nodde next) {
		this.ele = ele;
		this.next = next;
	}
	
}
class Hasset{
	private Nodde[] a=new Nodde[10];
	private int count;
	
	public void add(int ele) {
		int index =ele%a.length;
		if(a[index]==null) {
			a[index]=new Nodde(ele);
			count++;
			return;
		}
		Nodde curr=a[index];
		while(curr.next!=null) {
			if(curr.ele==ele)return ;
			curr=curr.next;
		}
		if(curr.ele!=ele)curr.next=new Nodde(ele);
		count++;
	}
	public int size() {
		return count;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Nodde curr=a[i];
			while(curr!=null) {
				System.out.print(curr.ele+" ");
				curr=curr.next;
			}
			System.out.println();
		}
	}
}

public class Prg19 {

	public static void main(String[] args) {
		Hasset h=new Hasset();
		h.add(10);
		h.add(20);
		h.add(35);
		h.display();
	}

}
