package com.jsp.Arraysss;

public class ReturnSemordnilap {

	public static void main(String[] args) {
		String[] arr= {"diaper", "abc", "test", "cba", "repaid"};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(isAnagram(arr[i], arr[j]))System.out.println("[\""+arr[i]+"\",\""+arr[j]+"\"]");
			}
		}

	}
	public static boolean isAnagram(String s1,String s2) {
		while(s1.length()==s2.length()) {
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			if(s1.length()==0&&s2.length()==0)return true;
		}
		return false;
	}

}
