package com.jsp.Arrays;

public class Prg5 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int n=15;
		boolean found=false;
		for(int n1:a) {
			if(n==n1) {
				found=true;
				break;
			}
			
		}
		if(found)System.out.println("found");
		else System.out.println("not found");

	}

}
