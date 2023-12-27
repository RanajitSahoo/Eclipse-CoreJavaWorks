package com.jsp.Queue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
class Student{
	int roll;

	public Student(int roll) {
		this.roll = roll;
	}
	
	@Override
	public boolean equals(Object e) {
		  return this.roll==((Student)e).roll;
	}
	@Override
	public String toString() {
		return "Student [ rollno = "+roll+"]";
	}
	
}
class rollCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.roll-o2.roll;
	}
	
}
public class QInterface {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add(50);
		q.add(10);
		q.add(20);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		Queue q1=new ArrayDeque();
		q1.add(50);
		q1.add(10);
		q1.add(20);
		while(!q1.isEmpty()) {
			System.out.print(q1.poll()+" ");
		}
		System.out.println();
		Queue q2=new PriorityQueue();
		q2.add(50);
		q2.add(10);
		q2.add(20);
		while(!q2.isEmpty()) {
			System.out.print(q2.poll()+" ");
		}
		System.out.println();
		Queue q3=new PriorityQueue(new rollCompare());
		q3.add(new Student(10));
		q3.add(new Student(30));
		q3.add(new Student(40));
		q3.add(new Student(20));
		while(!q3.isEmpty()) {
			System.out.println(q3.poll()+" ");
		}
	}

}
