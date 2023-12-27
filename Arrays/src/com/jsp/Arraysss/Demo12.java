package com.jsp.Arraysss;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5},b= {3,4,5,6,7,8};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				a[i]=b[i];
		}
		for(int n:a)
		{
			System.out.print(n+" s");
		}

	}

}
