package com.jsp.String;


class Circle{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.radius==((Circle)obj).radius;
	}
	
	@Override
	public String toString() {
		return "Circle[ radius = "+this.radius+" ]";
	}
}

public class CheckEqualPrintCustom {

	public static void main(String[] args) {
		Circle c1=new Circle(10);
		Circle c2=new Circle(10);
		System.out.println(c1.equals(c2));
		System.out.println(c1);
	}

}
