package com.jsp.String;

class Rectangle{
	int length;
	int breadth;
	public Rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;
	}
	@Override
	public String toString() {
		return "Rectangle [ length ="+this.length+", breadth = "+this.breadth+" ]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.length==((Rectangle)obj).length && this.breadth==((Rectangle)obj).breadth;
	}
}

public class RectangleEqulasAndToString {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20);
		Rectangle r1 = new Rectangle(10,20);
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r==r1);
		System.out.println(r.equals(r1));

	}

}
