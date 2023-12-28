package com.jsp.exam;

import java.util.Arrays;

public class Prg3 {

	public static void main(String[] args) {
		String s1="cat batman matter latt cat batman cat";
		String[] s2=s1.split(" ");
		String s3="";
		for(int i=0;i<s2.length;i++) {
			String t=s2[i];
			int count=1;
			
			for(int j=i+1;j<s2.length;j++) {
				if(s2[i].equals(s2[j])) {
					count++;
					
					s2[j]="";
				}
				
			}
			
			
			if(count>1) {
				
				s3+=t+" ";
			}
			
		}
		System.out.println(s3);

	}

}
