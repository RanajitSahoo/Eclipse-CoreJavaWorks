package com.jsp.jobPreparation;

import java.util.Stack;

public class Prg3 {

	public static void main(String[] args) {
		String s="{[]()}";
		System.out.println(isBalanced(s));

	}

	private static boolean isBalanced(String s) {
		Stack<Character> st=new Stack<Character>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(c=='{'||c=='('||c=='[')st.add(c);
			else if(c=='}'||c==')'||c==']') {
				if(st.isEmpty()||!pair(st.pop(),c))return false;
			}
		}
		return st.isEmpty();
	}

	private static boolean pair(Character c1, char c2) {
		if(c1=='{'&&c2=='}')return true;
		if(c1=='('&&c2==')')return true;
		if(c1=='['&&c2==']')return true;
		return false;
	}

}
