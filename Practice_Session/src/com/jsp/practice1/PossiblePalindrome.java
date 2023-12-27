package com.jsp.practice1;

public class PossiblePalindrome {

	public static void main(String[] args) {
		String s1="banana";
		for(int i=0;i<s1.length()-1;i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(isPalin(s1,i,j)) {
					System.out.println(s1.substring(i,j+1));
				}
			}
		}

	}
	public static boolean isPalin(String s,int start,int end) {
		int i=start,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}

}
