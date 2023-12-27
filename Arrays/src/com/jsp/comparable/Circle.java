package com.jsp.comparable;

public class Circle implements Comparable{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle[ radius= "+radius+"]";
	}
	@Override
	public int compareTo(Object o) {
		return ((Circle)o).radius-this.radius;
	}
	
	
}
