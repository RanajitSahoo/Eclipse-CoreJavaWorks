package com.jsp.String;

public class Prg30 {

	public static void main(String[] args) {
		String s="pwwkew";
		 char[] a=s.toCharArray();
		 String s1="";
		 int max=0;
	     A:for(int i=0;i<a.length-1;i++) {
	    	s1+=a[i];
	    	 B:for(int j=i+1;j<a.length;j++) {
	    		 
	    		 if(a[i]==a[j])break B;
	    			 
	    		s1+=a[j];
	    	
	    	 }
	    	 char[] b=s1.toCharArray();
	    	 C:for(int j=0;j<b.length-1;j++) {
	    		 if(b[j]==b[j+1]) {
	    			 s1="";
	    			 break C;
	    		 }
	    	 }
	    	 System.out.println(s1);
	    	 if(max<s1.length())max=s1.length();
	    	 s1="";
	    	 
	    	
	     }
	     
	      System.out.println(max);  
	       

	}
//	public static String is(String s,int i,int j) {
//		char[] a=s.toCharArray();
//		
//	}

}
