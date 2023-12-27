package com.jsp.Arraysss;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s1="abcbdcaf";
		int i=0;
		while(i<s1.length()) {
			int j=i+1;
			while(j!=s1.length()-1)j++;
			int k=j;
			boolean flag=true;
			while(k>=0) {
//				System.out.println(k);
				if(s1.charAt(i)==s1.charAt(k)) {
					flag=false;
					break;
				}
				k--;
			}
			if(flag) {
				System.out.println("The first non-repeating character is "+s1.charAt(i)+" and is found at index "+ i);
				return;
			}
			
			i++;
			
		}

	}

}
