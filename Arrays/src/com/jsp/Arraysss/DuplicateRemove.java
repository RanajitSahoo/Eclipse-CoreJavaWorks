package com.jsp.Arraysss;

public class DuplicateRemove {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5},b= {3,4,5,6,7,8};
		
		
		for(int i=0;i<a.length;i++) {
			int k=a[i];
			for(int j=0;j<b.length;j++) {
				if(k==b[j]) {
					b[j]=-1;
				}
				
			}
			
		}
		int[] c=new int[a.length+b.length];
		int l=0;
		for(int i=0;i<a.length;i++) {
			c[l++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=-1)c[l++]=b[i];
		}
		
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]==0)count++;
		}
		
		for(int i=0;i<c.length-count;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
