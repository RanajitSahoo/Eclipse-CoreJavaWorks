package com.jsp.Sorting;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prg2 {

	public static void main(String[] args) {
//		int[] a= {1,2};
//		int[] b= {3,4};
//		int[] c=new int[a.length+b.length];
//		int i=0;
//		for(int j=i;j<a.length;j++)c[i++]=a[j];
//        for(int j=0;j<b.length;j++)c[i++]=b[j];
//        Arrays.sort(c);
//        System.out.println(Arrays.toString(c));
//        double d=(double)(c[c.length/2]+c[c.length/2-1])/2;
		int d=942+9465;
		int n=249;
//		int m=5649;
		Pattern p=Pattern.compile("b[a-z]*b");
        Matcher m=p.matcher("cbbd");
        String s1="";
        while(m.find()){
            s1=m.group();
            System.out.println(m.group());
        }
       
//        System.out.println(d);

	}

}
