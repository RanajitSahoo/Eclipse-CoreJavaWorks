package com.jsp.comparable;

import java.util.Arrays;

public class TestCircle {

	public static void main(String[] args) {
		Circle[] arr= {
				new Circle(10),
				new Circle(30),
				new Circle(20),
				new Circle(80),
				new Circle(90),
				new Circle(40),
				new Circle(70),
				new Circle(60),
		};
		Arrays.sort(arr);
		for(Circle c:arr) {
			System.out.println(c);
		}

	}

}
