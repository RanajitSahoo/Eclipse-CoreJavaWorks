package raja.finalmock.Practice;

//class AL{
//	private Object[] a=new Object[5];
//	private int p;
//	public void add(Object ele) {
//		if(p>=a.length)increase();
//		a[p++]=ele;
//	}
//	private void increase() {
//		Object[] temp=new Object[a.length+3];
//		System.arraycopy(a, 0, temp, 0, a.length);
//		a=temp;
//	}
//	public int size() {
//		return p;
//	}
//	public Object get(int index) {
//		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
//		return a[index];
//	}
//	public void add(int index,int ele) {
//		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
//		for(int i=size()-1;i>=index;i--) {
//			a[i+1]=a[i];
//		}
//		a[index]=ele;
//		p++;
//	}
//	public void remove(int index) {
//		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
//		for(int i=index;i<size();i++) {
//			a[i]=a[i+1];
//		}
//		a[p]=null;
//		p--;
//	}
//}

class AL{
	private Object[] a=new Object[5];
	private int p;
	public void add(int n) {
		if(p>a.length)increase();
		a[p++]=n;
	}
	private void increase() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	public int size() {
		return p;
	}
	public Object get(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		return a[index];
	}
	public void add(int index,int ele) {
		if(index<=-1||index>size())throw new IndexOutOfBoundsException();
		if(p>a.length)increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=ele;
		p++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		for(int i=index;i<size();i++) {
			a[i]=a[i+1];
		}
		a[p]=null;
		p--;
	}
}

public class Prg6 {

	public static void main(String[] args) {
		AL a=new AL();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(3,40);
//		a.remove(3);
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}

	}

}
