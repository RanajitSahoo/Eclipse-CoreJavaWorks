package com.String.Prg1;

public class Prg2 {

	public static void main(String[] args) {
		String s1="qazwsxedcrfvtgbyhnujmikolp";
		String s2="abcdefghijklmnopqrstuvwxyz";
		if(panagram(s1,s2))System.out.println("panagram");
		else System.out.println("not panagram");
	}
	public static boolean panagram(String s1,String s2) {
		
		while(s1.length()>0) {
			char c=s1.charAt(0);
			System.out.println(c);
			if(s1.length()!=s2.length()) return false;
			s1=s1.replace(c+"","");
			s2=s2.replace(c+"","");
			if(s1.length()==0&&s2.length()==0) return true;
		}
		return false;
	}

}
