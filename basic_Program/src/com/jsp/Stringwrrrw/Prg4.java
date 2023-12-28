package com.jsp.Stringwrrrw;

public class Prg4 {

	public static void main(String[] args) {
		String s="Banana";
		int big=0;
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPlain(s,i,j)) {
					String s1=s.substring(i, j+1);
					int num=s1.length();
					if(num>big)big=num;
				}
			}
		}
		System.out.println(big);

	}
	
	public static boolean isPlain(String s,int start,int end) {
		int i=start,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
