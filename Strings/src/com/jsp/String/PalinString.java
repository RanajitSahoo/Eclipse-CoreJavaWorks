package com.jsp.String;

public class PalinString {

	public static void main(String[] args) {
		String s="banana";
		
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(palinString(s, i,j)) {
					System.out.println(s.substring(i,j+1));
				}
			}
		}

	}
	public static boolean palinString(String s,int start,int end) {
		int i=start,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
