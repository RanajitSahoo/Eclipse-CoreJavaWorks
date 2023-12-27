package com.jsp.Queue;

public class Test {

	public static void main(String[] args) {
//		Queue q=new Queue();
//		q.add(10);
//		q.add(20);
//		q.add(30);
//		for(int i=0;i<q.size();i++) {
//			System.out.print(q.get(i)+" ");
//		}
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.size());
//		System.out.println(q.poll());
//		for(int i=0;i<q.size();i++) {
//			System.out.print(q.get(i)+" ");
//		}
//		q.add(10);
//		q.add(20);
//		q.add(30);
//		for(int i=0;i<q.size();i++) {
//			System.out.print(q.get(i)+" ");
//		}
//		System.out.println(q.peek());
//		q.add(40);
//		System.out.println(q.peek());
//		for(int i=0;i<q.size();i++) {
//			System.out.print(q.get(i)+" ");
//		}
		
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.pop());
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.size());
	}

}
