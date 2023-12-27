package ArrayList;

import java.util.Arrays;

public class ArrayList {
	private Object[] a=new Object[5];
	private int p=0;
	
	private void increase() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	
	public void add(int ele) {
		if(p>=a.length)increase();
		a[p++]=ele;
		
	}
	public int size() {
		return p;
	}
	public void add(int ele,int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		if(p>=a.length)increase();
		for(int i=size()-1;i>index;i--) {
			a[i+1]=a[i];
		}
		a[index]=ele;
		p++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		for(int i=index;i<size();i++) {
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
		
	}
	public Object get(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	public static void main(String... args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(60);
		a1.add(80);
		a1.add(70);
		a1.add(22,2);
		
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++) {
			System.out.print(a1.get(i)+" ");
		}
		a1.remove(3);
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++) {
			System.out.print(a1.get(i)+" ");
		}
		
		
	}
}
