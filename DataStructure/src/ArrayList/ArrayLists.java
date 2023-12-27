package ArrayList;

public class ArrayLists {

	private Object[] a=new Object[5];
	private int p=0;
	
	public void add(Object e) {
		if(p>=a.length)increase();
		a[p++]=e;
	}
	private void increase() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public int size() {
		return p;
	}
	
	public void add(int index,Object e) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
			
		}
		if(p>=a.length) increase();
		for(int i=size()-1;i>index;i--) {
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	 public void remove(int index) {
		 if(index<=-1||index>=size()) {
			 throw new IndexOutOfBoundsException();
		 }
		 for(int i=index;i<size();i++) {
			 a[i]=a[i+1];
		 }
		 a[p]=null;
		 p--;
	 }

}
