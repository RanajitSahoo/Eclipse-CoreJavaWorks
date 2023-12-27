package com.jsp.ArrayListQueue;

public class ArrayListQ {
	private Object[] a=new Object[5];
	private int p;
	private void increase() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public void add(int key) {
		if(p>=a.length)increase();
		a[p++]=key;
	}
	public int size() {
		return p;
	}
	public Object peek() {
		return a[0];
	}
	public Object poll() {
		Object n=a[0];
		for(int i=0;i<size();i++) {
			a[i]=a[i+1];
		}
		p--;
		a[p]=null;
		return n;
	}
	 
	public static void main(String[] args) {
		ArrayListQ a=new ArrayListQ();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a.peek());
		System.out.println(a.size());
		System.out.println(a.poll());
		System.out.println(a.size());
		System.out.println(a.peek());

	}

}
