package com.jsp.ArrayListQueue;

public class ArrayListStack {
	private Object[] a= new Object[5];
	private int p=0;
	private void increase() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public void push(int ele) {
		if(p>=a.length)increase();
		a[p++]=ele;
	}
	public int size() {
		return p;
	}
	public Object peek() {
		return a[size()-1];
	}
	public Object pop() {
		Object n=a[p-1];
		
		a[p]=null;
		p--;
		return n;
	}
	public static void main(String[] args) {
		ArrayListStack a=new ArrayListStack();
		a.push(10);
		a.push(20);
		a.push(30);
		System.out.println(a.size());
		System.out.println(a.peek());
		System.out.println(a.pop());
		System.out.println(a.size());
		System.out.println(a.peek());
		System.out.println(a.pop());
		System.out.println(a.size());
		System.out.println(a.peek());
		a.push(40);
		a.push(50);
//		System.out.println(a.pop());
		System.out.println(a.size());
		System.out.println(a.peek());
		System.out.println(a.pop());
		System.out.println(a.size());
		System.out.println(a.peek());
		System.out.println(a.size());
		a.push(40);
		a.push(60);
		System.out.println(a.size());
		System.out.println(a.peek());
	}

}
