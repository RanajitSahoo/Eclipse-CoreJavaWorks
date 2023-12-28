package com.jsp.Practice;

import java.util.Arrays;

public class Prg9 {

	public static void main(String[] args) {
		int n = 5, k = 107;
		char[] arr=new char[n];
		
        Arrays.fill(arr,'a');
//        for(int i=n-1;i>=0;i--){
//            k-=i;
//            System.out.println(k+"-----");
//            if(k>=0){
//                if(k>=26){
//                	System.out.println(k+"if");
//                    arr[i]='z';
//                    k-=26;
//                }else{
//                	System.out.println(k+"else");
//                    arr[i]=(char)(k+97-1);
//                    k-=arr[i]-'a'+1;
//                }
//            }else break;
//            System.out.println(k+"-----");
//            k+=i;
//            System.out.println(k+"-----");
//            String string = new String(arr);
//            System.out.println(string); 
//        }
        for(int i=n-1;i>=0;i--) {
        	k-=i;
        	if(k>=0) {
        		if(k>=26) {
        			arr[i]='z';
        			k-=26;
        		}else {
        			arr[i]=(char)(k+97-1);
        			k-=arr[i]-'a'+1;
        		}
        	}else break;
        	k+=i;
        }
        String string = new String(arr);
      System.out.println(string); 

	}



}
