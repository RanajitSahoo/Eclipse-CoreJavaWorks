package com.jsp.SpecialPattern;

public class Spiral1 {

	public static void main(String[] args) {
		int size=5;
		int[][] a=new int[size][size];
		int r=0,c=-1;
		String dir="right";
		for(int i=1;i<=size*size;i++) {
			switch(dir) {
				case "right":c++;
						a[r][c]=i;
						if(c==size-1||a[r][c+1]!=0)dir="down";
						break;
				case "down":r++;
							a[r][c]=i;
							if(r==size-1||a[r+1][c]!=0)dir="left";
							break;
				case "left":c--;
							a[r][c]=i;
							if(c==0||a[r][c-1]!=0)dir="up";
							break;
				case "up":r--;
						  a[r][c]=i;
						  if(a[r-1][c]!=0)dir="right";
						  break;
			}
		}
		for(int[] t:a) {
			for(int n:t)System.out.print(n+"\t");
			System.out.println();
		}
	}

}
