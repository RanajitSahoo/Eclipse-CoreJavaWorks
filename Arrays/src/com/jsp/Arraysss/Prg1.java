package com.jsp.Arraysss;

public class Prg1 {

	public static void main(String[] args) {
		int[] a= {1,2,4,7,6,8,0,3};
		int key=8;
		int n=search(a,key);
		if(n==-1)System.out.println("not found");
		else System.out.println("found");

	}
	public static int search(int[] a,int n) {
		for(int n1:a) {
			if(n1==n)return 1;
		}
		return -1; 
	}

}
