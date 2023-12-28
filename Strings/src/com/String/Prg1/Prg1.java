package com.String.Prg1;

public class Prg1 {

	public static void main(String[] args) {
		String s1="aaeioau";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					
				}
				
				
			}
			System.out.println(ch[i]+""+count);
		}

	}

}
